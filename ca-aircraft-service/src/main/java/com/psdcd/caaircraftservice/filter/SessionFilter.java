package com.psdcd.caaircraftservice.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebFilter(filterName = "sessionFilter",urlPatterns = {"/*"})
public class SessionFilter implements Filter {

    String NO_LOGIN = "您还未登录";

    String[] includeUrls = new String[]{"/login","/login_in"};

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        HttpSession session = request.getSession();
        String url = request.getRequestURI();
        boolean needFilter = isNeedFilter(url);

        //静态资源放行
        if(url.endsWith(".css")||url.endsWith(".js")||url.endsWith(".jpg")
                ||url.endsWith(".gif")||url.endsWith(".png")){
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        if(!needFilter){
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            UserinfoTbl user = (UserinfoTbl)session.getAttribute(session.getId());
            if(user != null){
                filterChain.doFilter(servletRequest, servletResponse);
            } else {
                String requestType = request.getHeader("X-Requested-With");
                //判断是否是ajax请求
                if(requestType!=null && "XMLHttpRequest".equals(requestType)){
                    response.getWriter().write(this.NO_LOGIN);
                }else{
                    //重定向到登录页(需要在static文件夹下建立此html文件)
                    response.sendRedirect(request.getContextPath()+"/login");
                }
                return;
            }
        }
    }

    public boolean isNeedFilter(String uri) {
        for (String includeUrl : includeUrls) {
            if(includeUrl.equals(uri)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void destroy() {

    }
}
