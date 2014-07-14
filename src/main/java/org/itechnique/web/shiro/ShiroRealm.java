package org.itechnique.web.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.itechnique.web.passport.OAuth;
import org.itechnique.web.passport.bean.User;
import org.springframework.beans.factory.annotation.Autowired;

public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    OAuth userManager;
    
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String) principals.fromRealm(getName()).iterator().next();
        if(username != null){
            User user = userManager.getUser(username);
            if( user != null && user.getRoles() != null ){
                SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
                info.addRole(user.getRoles());
                info.addStringPermission(user.getPermission());
            }
        }
        return null;
    }

    // 获取认证信息
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
            throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        String username = token.getUsername(); 
        if(username != null && !"".equals(username)){
            User user = userManager.getUser(username);
            if(user != null){
                return new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(),getName());
            }
        }
        return null;
    }

}
