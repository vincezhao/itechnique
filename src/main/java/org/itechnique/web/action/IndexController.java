package org.itechnique.web.action;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.itechnique.module.bean.ModuleItem;
import org.itechnique.module.service.intf.IModule;
import org.itechnique.web.passport.OAuth;
import org.itechnique.web.passport.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * 功能描述： 首页
 * @author 作者 zhaowen@itechnique.com
 * @created 2014-5-13 下午9:11:26
 * @version 1.0.0
 * @date 2014-5-13 下午9:11:26
 */
@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    OAuth oauth;
    
    @Autowired
    IModule moduleservice;

    @RequestMapping("index")
    public String index(Model model, HttpServletRequest requert, HttpServletResponse response) {
        List<ModuleItem> list = moduleservice.queryAll();
        model.addAttribute("modules", list);
        return "index.ftl";
    }
    
    @RequestMapping("header")
    public String header(ServletRequest requert, ServletResponse response) {
        return "header.ftl";
    }

    @RequestMapping(method = RequestMethod.POST, value = "register")
    public String register(@RequestParam("username") String username,
            @RequestParam("password") String password) {
        if (StringUtils.isNotBlank(username) && StringUtils.isNotBlank(password)) {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setEnable(0);
            oauth.insertUser(user);
        } else {
            logger.warn("username or password is empty!");
        }
        return "login.ftl";
    }

}
