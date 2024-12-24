package com.app.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
@ComponentScan(basePackages = "com.app.project")  // 프로젝트의 패키지를 스캔
public class MainController{
    public static void main(String[] args) {

    }
}
