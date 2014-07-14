package org.itechnique.member.bean;

/**
 * 功能描述： 会员信息常量
 * @author 作者 zhaowen@itechnique.com
 * @created 2014-5-8 下午8:59:45
 * @version 1.0.0
 * @date 2014-5-8 下午8:59:45
 */
public class MemberConstant {

    /*
     * 权限等级
     */
    public static enum LEVEL {
        
        ADMIN(1,"管理员"),
        VIP(2,"高级会员"),
        MEMBER(3,"普通会员"),
        VISITOR(4,"游客"),
        BAN(5,"黑名单"),
        NONE(6,"无");
        
        private Integer value;
        
        private String desc;
        
        LEVEL(Integer level, String desc){
            this.value = level;
            this.desc = desc;
        }
        
        public Integer getValue(){
            return this.value;
        }

        public String getDesc() {
            return desc;
        }
    }
    
    /*
     * 教育程度
     */
    public static enum EDUCATION {
        
    }
}
