package org.itechnique.interact.bean;

import java.util.Date;

/**
 * 
 * 功能描述：技术回答实体类
 * @author 作者 zhaowen@itechnique.com
 * @created 2014-5-4 下午8:49:02
 * @version 1.0.0
 * @date 2014-5-4 下午8:49:02
 */
public class AnswerBean {
    // 序号
    private String  id;

    // 对应问题ID
    private String  issueId;

    // 回答者ID
    private String  answerId;

    // 回答内容
    private String  content;

    // 创建时间
    private Date    createTime;

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

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getAnswerId() {
        return answerId;
    }

    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
