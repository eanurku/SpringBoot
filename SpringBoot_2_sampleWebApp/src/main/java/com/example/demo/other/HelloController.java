package com.example.demo.other;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    String test() {
        return "OK bro";
    }

    @GetMapping("/hello")
    String gethello() {
        return "hello  to spring boot";
    }

}
