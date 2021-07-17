package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Import(
        ProcessorSwaggerConfig.class
)
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String testMe(){
        return "test is Ok!!";
    }
}
