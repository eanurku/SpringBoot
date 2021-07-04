package com.anurag.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tx/group",produces = {"application/xml"})
public class TxGroupController {

    @GetMapping
    public String test(){
        return "tested ok";
    }

}
