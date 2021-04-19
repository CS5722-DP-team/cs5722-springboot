package org.ul.dpproj.entity.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {

        if(request.getRequestURI().indexOf("login.action")>=0){
            return true; }
        HttpSession session = request.getSession();

        if(session.getAttribute("user")!=null){
            return true; }

        request.getRequestDispatcher("../views/Login.vue").forward(request,
                response);
        return false;
    }
}
