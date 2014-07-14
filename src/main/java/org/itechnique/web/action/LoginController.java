package org.itechnique.web.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.itechnique.web.passport.OAuth;
import org.itechnique.web.passport.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    OAuth oauth;
    
    @RequestMapping("logon")
    public String logon(){
        return "login.ftl";
    }

    @RequestMapping(method = RequestMethod.POST, value = "login")
    public String login(@RequestParam("username") String username,
            @RequestParam("password") String password) {
        if (StringUtils.isNotBlank(username) && StringUtils.isNotBlank(password)) {
            User user = oauth.getUser(username);
            if (StringUtils.isBlank(user.getId())) {
                // TODO 用户不存在
            }
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            try {
                SecurityUtils.getSubject().login(token);
            } catch (AuthenticationException e) {
                // 用户名密码错误
            }
            Integer enable = user.getEnable();
            if (enable.intValue() != 1) {
                // TODO 用户未激活
            }
        }
        return "";
    }
    
    /*
     * 校验注册的用户名是否已经使用
     */
    @RequestMapping(method = RequestMethod.POST, value = "check")
    public void checkName(@RequestParam("username") String username, ServletResponse response) {
        System.out.println(username);
        if (StringUtils.isBlank(username)) {
            logger.error("username is blank!");
            return;
        }
        System.out.println(username);
        User user = oauth.getUser(username);
        PrintWriter out = null;
        try {
            out = response.getWriter();
            if (user != null && StringUtils.isNotBlank(user.getUsername())) {
                out.write("no");
            } else {
                out.write("yes");
            }
        } catch (IOException e) {
            logger.error("check error : ", e);
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
