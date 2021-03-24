package com.anurag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsonToJavaObjectConversionApp {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(JsonToJavaObjectConversionApp.class);
        springApplication.setAllowBeanDefinitionOverriding(true);
        springApplication.run(args);
    }

}
