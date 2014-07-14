package org.itechnique.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 功能描述： 权限过滤
 * @author 作者 zhaowen@itechnique.com
 * @created 2014-5-8 下午7:50:01
 * @version 1.0.0
 * @date 2014-5-8 下午7:50:01
 */
public class VerifyFilter implements Filter {

    @Override
    public void destroy() {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        //TODO
        
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        
    }

}
