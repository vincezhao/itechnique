package org.itechnique.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("blog")
public class BlogController {
    
    @RequestMapping("blogs")
    public String blogIndex(){
        return "blog/blogindex.ftl";
    }
    
    /**
     * 功能描述：进入博文主页
     */
    @RequestMapping("blog")
    public String mainBlog(){
        
        return "blog/blog.ftl";
    }
    
    /**
     * 功能描述：进入博文详细页面
     */
    @RequestMapping("view")
    public String viewBlog(){
        return "";
    }
    
    /**
     * 功能描述：创建一篇博文
     */
    @RequestMapping("create")
    public String createBlog(){
        return "";
    }
    
    /**
     * 功能描述：修改博文
     */
    @RequestMapping("modify")
    public String modifyBlog(){
        return "";
    }
    
    /**
     * 功能描述：删除博文
     */
    @RequestMapping("delete")
    public String deleteBlog(){
        return "";
    }
    
    /**
     * 功能描述：评论博文
     */
    @RequestMapping("comment")
    public String commentBlog(){
        return "";
    }
    
    /**
     * 功能描述：转发博文
     */
    @RequestMapping("transmit")
    public String transmitBlog(){
        return "";
    }
}
