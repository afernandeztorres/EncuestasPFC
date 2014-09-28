package com.aft.encuestas.control.core;

import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;



public class FilterAOP implements Filter{

     static final Logger LOG = Logger.getLogger(FilterAOP.class);

    
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        HttpServletRequest h = (HttpServletRequest)servletRequest;
        LOG.info("Start " + h.getRequestURL());
        filterChain.doFilter(servletRequest,servletResponse);
        LOG.info("Finish " + h.getRequestURL());

    }

    
    public void destroy() {

    }
}
