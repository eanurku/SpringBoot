package com.anurag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    private GreetingService greetingService;

    //no need to autowire greetingService as automatically done if constructor is used
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping("/greeting")
    public @ResponseBody String getGreeting() {

        return greetingService.getGreeting();
    }
}
