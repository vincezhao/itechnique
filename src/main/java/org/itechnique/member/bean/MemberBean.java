package org.itechnique.member.bean;

public class MemberBean {
    // 会员编号
    private String  custoNum;

    // 用户昵称
    private String  nickName;

    // 姓名
    private String  name;

    // 性别0:男,1：女
    private Integer sex;

    // 年龄
    private Integer age;

    // 联系电话
    private String  telephone;

    // 邮箱
    private String  email;

    // 权限级别
    private Integer level;

    // QQ号
    private String  qq;

    // 教育程度
    private Integer education;

    // 所在行业
    private String  industry;

    // 所在类别
    private String  category;

    // 拥有关注度
    private Integer follows;

    // 所在公司
    private String  company;

    public String getCustoNum() {
        return custoNum;
    }

    public void setCustoNum(String custoNum) {
        this.custoNum = custoNum;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Integer getFollows() {
        return follows;
    }

    public void setFollows(Integer follows) {
        this.follows = follows;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

}
