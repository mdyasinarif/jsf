/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yasin;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 *
 * @author Students
 */
public class AuditFilter implements Filter {

    private static final boolean debug = false;

    private FilterConfig filterConfig = null;

    public AuditFilter() {
    }

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        long startTime = System.currentTimeMillis();
        String remoteAddress = request.getRemoteAddr();
        String remoteHost = request.getRemoteHost();
        HttpServletRequest myReq = (HttpServletRequest) request;
        String reqURI = myReq.getRequestURI();
        chain.doFilter(request, response);
        filterConfig.getServletContext().log(
                "user at IP " + remoteAddress + "(" + remoteHost 
                + ")accessed resource" + reqURI + " and user " 
                + (System.currentTimeMillis() - startTime) + " ms");
    }

    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;

    }

    public void destroy() {
    }

}
