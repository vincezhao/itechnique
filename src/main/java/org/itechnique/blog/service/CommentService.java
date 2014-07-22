package org.itechnique.blog.service;

import java.util.List;

import org.itechnique.blog.bean.Comment;
import org.itechnique.blog.service.intf.IComment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class CommentService implements IComment {

    private static final Logger logger = LoggerFactory.getLogger(CommentService.class);
    
    @Autowired
    MongoTemplate mongoTemplate;
    
    public void insertComment(Comment comment){
        if(comment != null){
            mongoTemplate.save(comment);
        }
    }
    
    public void deleteComment(String id){
        
    }
    
    public List<Comment> queryById(String id){
        return null;
    }
    
    public List<Comment> queryByAuthor(String author){
        return null;
    }
}
