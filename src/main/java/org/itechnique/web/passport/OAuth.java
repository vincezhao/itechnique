package org.itechnique.web.passport;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.itechnique.web.passport.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

/**
 * 功能描述： 单点登录
 * @author 作者 zhaowen@itechnique.com
 * @created 2014-5-5 下午10:07:26
 * @version 1.0.0
 * @date 2014-5-5 下午10:07:26
 */
@Service
public class OAuth {
    
    @Autowired
    SqlSession sqlSession;
    
    /**
     * 功能描述：根据用户名查询用户信息
     * @param 参数说明
     * @return 返回值
     */
    public User getUser(String username){
        Map<String, String> param = new HashMap<String, String>();
        param.put("username", username);
        return sqlSession.selectOne("ITECHNIQUE_USER.SELECT", param);
    }
    
    /**
     * 功能描述：创建一个新的用户
     * @param 用户信息
     * @return 描述信息，成功返回succeed
     */
    public String insertUser(User user){
        String out = "";
        try{
            sqlSession.insert("ITECHNIQUE_USER.INSERT", user);
            out = "succeed";
        }catch(DuplicateKeyException dke){
            out = "username exist";
        }
        return out;
    }
    
    /**
     * 功能描述：根据用户名修改密码
     * @param 参数说明
     * @return 返回值
     */
    public void updatePwd(User user){
        sqlSession.update("ITECHNIQUE_USER.UPDATEPWD", user);
    }
    
    public void updateEnable(User user){
        sqlSession.update("ITECHNIQUE_USER.UPDATEENABLE", user);
    }
    
}
