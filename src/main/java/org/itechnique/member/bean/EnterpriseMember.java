package org.itechnique.member.bean;

public class EnterpriseMember {
    // 会员编号
    private String  custoNum;

    // 公司名称
    private String  company;

    // 联系电话
    private String  telephone;

    // 邮箱
    private String  address;

    // 所在行业
    private String  industry;

    // 所在类别
    private String  category;

    // 拥有关注度
    private Integer follows;

    // 公司规模
    private String  scale;

    // 所在省
    private String  province;

    //
    private String  city;

    public String getCustoNum() {
        return custoNum;
    }

    public void setCustoNum(String custoNum) {
        this.custoNum = custoNum;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
