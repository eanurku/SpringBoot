package com.example.demo.other;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    String test() {
        return "OK bro";
    }

    @RequestMapping("/hello")
    String gethello() {
        return "hello  to spring boot";
    }

}
