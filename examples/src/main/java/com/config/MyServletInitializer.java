package com.config;

import com.servlet.MyServlet;
import org.springframework.web.*;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;


public class MyServletInitializer implements org.springframework.web.WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic dynamic = servletContext.addServlet("myservlet", MyServlet.class);
        dynamic.addMapping("/customer");
    }
}
