package org.itechnique.blog.bean;

/**
 * 功能描述： 博文条目类
 * @author 作者 zhaowen@itechnique.com
 * @created 2014-7-5 上午9:49:28
 * @version 1.0.0
 * @date 2014-7-5 上午9:49:28
 */
public class BlogBrief {
    // 标题
    private String title;

    // 文章详情链接
    private String titleUrl;

    // 发布时间
    private String pubdate;

    // 分类
    private String category;

    // 类别连接
    private String categoryUrl;

    // 简述
    private String content;

    // 评论URL
    private String commentUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleUrl() {
        return titleUrl;
    }

    public void setTitleUrl(String titleUrl) {
        this.titleUrl = titleUrl;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryUrl() {
        return categoryUrl;
    }

    public void setCategoryUrl(String categoryUrl) {
        this.categoryUrl = categoryUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCommentUrl() {
        return commentUrl;
    }

    public void setCommentUrl(String commentUrl) {
        this.commentUrl = commentUrl;
    }

}
