package org.itechnique.interact.bean;
/**
 * 
 * 功能描述： 技术求助实体类
 * @author 作者 zhaowen@itechnique.com
 * @created 2014-5-4 下午8:48:18
 * @version 1.0.0
 * @date 2014-5-4 下午8:48:18
 */
public class InteractBean {
    // 序号
    private String  id;

    // 提问者ID
    private String  initiator;

    // 具体问题内容
    private String  content;

    // 所在行业
    private String  industry;

    // 所在类别
    private String  category;

    // 有用程度(赞的数量)
    private Integer useful;

    // 解决程度0:未解决,1:已经解决
    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public Integer getUseful() {
        return useful;
    }

    public void setUseful(Integer useful) {
        this.useful = useful;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
