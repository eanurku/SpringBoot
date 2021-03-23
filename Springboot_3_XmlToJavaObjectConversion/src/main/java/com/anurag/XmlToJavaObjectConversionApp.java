package com.anurag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XmlToJavaObjectConversionApp {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(XmlToJavaObjectConversionApp.class);
        //bean definitions override
        springApplication.setAllowBeanDefinitionOverriding(true);
        springApplication.run(args);

    }
}
