package com.example.demo.controller;

import com.example.demo.model.User;
import jdk.nashorn.internal.objects.NativeJSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    @GetMapping("/home")
    public String index(){
        return "index";
    }

    @PostMapping("/submit")
    public String getData(@ModelAttribute("auser") User user, ModelMap model){

        model.addAttribute("name",user.getFirstName()+" "+user.getLastName());
        model.addAttribute("age",user.getAge());
        System.out.println(user.getFirstName());
        return "submitted";
    }
}
