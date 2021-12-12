package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication(scanBasePackages={"com", "com.mybatis.MyController"})
public class Application {
    public static void main(String[] args){
        //springboot 启动配置
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
    }
}
