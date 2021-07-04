package com.anurag.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tx/result",produces = { MediaType.APPLICATION_JSON_VALUE })
public class TxResultsController {

    @GetMapping
    public String test(){
        return "tested ok";
    }
}
