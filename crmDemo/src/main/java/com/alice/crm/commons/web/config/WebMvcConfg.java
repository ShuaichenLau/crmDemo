package com.alice.crm.commons.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfg implements WebMvcConfigurer {

    public final static String SESSION_KEY = "user";

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/emp/**", "/workbench/index").excludePathPatterns("/index.html");
    }

}
