package com.demo.listener;

import com.demo.utils.ApplicationUtil;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Max on 2017/3/10.
 */
public class ApplicationUtilListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
        ApplicationUtil.setApplicationContext(webApplicationContext);
    }

    public void contextDestroyed(ServletContextEvent sce) {
    }
}
