package com.demo.utils;

import org.springframework.context.ApplicationContext;

/**
 * Created by Max on 2017/3/10.
 */
public class ApplicationUtil {

    public static ApplicationContext applicationContext;

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static void setApplicationContext(ApplicationContext applicationContext) {
        ApplicationUtil.applicationContext = applicationContext;
    }

    public static Object getBean(String name){
        return (ApplicationUtil.applicationContext.getBean(name));
    }

}
