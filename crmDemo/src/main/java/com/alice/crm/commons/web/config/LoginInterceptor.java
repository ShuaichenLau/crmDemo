package com.alice.crm.commons.web.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object user = request.getSession().getAttribute("user");
        if (user == null || user.equals("")) {
            response.sendRedirect("/index.html");
            return false;
        }
        return true;
    }
}