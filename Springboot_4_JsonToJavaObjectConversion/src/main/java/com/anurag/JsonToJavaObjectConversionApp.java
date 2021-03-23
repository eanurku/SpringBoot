package com.anurag;

import com.anurag.json.Groups;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JsonToJavaObjectConversionApp {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(JsonToJavaObjectConversionApp.class);
        springApplication.setAllowBeanDefinitionOverriding(true);
        springApplication.run(args);
    }

}
