package org.itechnique.blog.service;

import java.util.Date;
import java.util.List;

import org.itechnique.blog.bean.BlogBean;
import org.itechnique.blog.service.intf.IBlog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class BlogService implements IBlog {

    private static final Logger logger = LoggerFactory.getLogger(BlogService.class);
    
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void createBlog(BlogBean blog) {
        if (blog != null) {
            mongoTemplate.save(blog);
        }
    }

    @Override
    public void modifyBlog(BlogBean blog) {
        if(blog == null){
            logger.error("BlogBean is null!!");
            return;
        }
        Query query = new Query(Criteria.where("_id").is(blog.getId()));
        Update update = Update.update("title", blog.getTitle()).set("title", blog.getTitle())
                .set("content", blog.getContent()).set("modifyTime", new Date());
        mongoTemplate.updateMulti(query, update, BlogBean.class);

    }

    @Override
    public void deleteBlog(BlogBean blog) {
        if (blog != null) {
            mongoTemplate.remove(blog);
        }
    }

    @Override
    public BlogBean queryByTitle(String title) {
        Query query = new Query(Criteria.where("title").regex(title, "i"));
        List<BlogBean> list = mongoTemplate.find(query, BlogBean.class);
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<BlogBean> queryByIndustry(Integer industry, Integer startIndex, Integer length) {
        Query query = new Query(Criteria.where("industry").is(industry));
        query.skip(startIndex);
        query.limit(length);
        List<BlogBean> list = mongoTemplate.find(query, BlogBean.class);
        return list;
    }

    @Override
    public List<BlogBean> queryByCategory(Integer category, Integer startIndex, Integer length) {
        Query query = new Query(Criteria.where("category").is(category));
        query.skip(startIndex);
        query.limit(length);
        List<BlogBean> list = mongoTemplate.find(query, BlogBean.class);
        return list;
    }

    @Override
    public List<BlogBean> queryByAuthor(String Author, Integer startIndex, Integer length) {
        Query query = new Query(Criteria.where("author").regex(Author, "i"));
        query.skip(startIndex);
        query.limit(length);
        List<BlogBean> list = mongoTemplate.find(query, BlogBean.class);
        return list;
    }

}
