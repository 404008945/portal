package com.xishan.store.portal.portalweb.interceptor;

import com.xishan.store.base.annoation.Authority;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthorityInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(handler.getClass().isAssignableFrom(HandlerMethod.class)){
            Authority auth = ((HandlerMethod) handler).getMethodAnnotation(Authority.class);

            if(auth == null)
                return true;
            else{
                HttpSession session = request.getSession();
                if(session.getAttribute("user") == null){
                    response.sendError(401,"user.not.login");
                    return false;
                }
            }

        }

            return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {//在这里包装response

    }
}
