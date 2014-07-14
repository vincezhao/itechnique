package org.itechnique.blog.service.intf;

import java.util.List;

import org.itechnique.blog.bean.BlogBean;

public interface IBlog {
    
    public void createBlog(BlogBean blog);
    
    public void modifyBlog(BlogBean blog);
    
    public void deleteBlog(BlogBean blog);
    
    public BlogBean queryByTitle(String title);
    
    public List<BlogBean> queryByIndustry(Integer industry,Integer startIndex,Integer length);
    
    public List<BlogBean> queryByCategory(Integer category,Integer startIndex,Integer length);
    
    public List<BlogBean> queryByAuthor(String Author,Integer startIndex,Integer length);
    
}
