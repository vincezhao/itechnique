package org.itechnique.news.bean;

import java.util.Date;

/**
 * 功能描述：普通新闻实体类
 * @author 作者 zhaowen@itechnique.com
 * @created 2014-5-1 下午5:37:16
 * @version 1.0.0
 * @date 2014-5-1 下午5:37:16
 */
public class NewsBean {
    // 序号
    private String  ID;

    // 标题
    private String  title;

    // 来源
    private String  source;

    // 简介
    private String  brief;

    // 所属行业
    private String  industry;

    // 二级分类
    private String  category;

    // 内容
    private String  content;

    // 浏览统计
    private Integer statistics;

    //
    private Date    createTime;

    //
    private Date    modifyTime;

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatistics() {
        return statistics;
    }

    public void setStatistics(Integer statistics) {
        this.statistics = statistics;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

}
