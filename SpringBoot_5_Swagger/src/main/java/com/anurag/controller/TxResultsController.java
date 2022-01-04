package com.anurag.controller;

import com.anurag.models.MDLeague;
import com.anurag.models.MDRegion;
import com.anurag.models.MDTeam;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/tx/result",produces = { MediaType.APPLICATION_JSON_VALUE })
public class TxResultsController {

    @Autowired
    ResourceLoader     resourceLoader;
    @Autowired
    ApplicationContext context;
    @GetMapping
    public String test(){
        return "tested ok";
    }

    @GetMapping("loadleagues")
    public String loadleagues() throws IOException {
        ObjectMapper mapper = new ObjectMapper();


        InputStream inputStream=new ClassPathResource("leagues_data.json").getInputStream();


        MDLeague[] data = mapper.readValue(inputStream, MDLeague[].class);

        System.out.println("count="+data.length);

        return "tested ok";
    }
    @GetMapping("loadteams")
    public String loadteams() throws IOException {
        ObjectMapper mapper = new ObjectMapper();


        InputStream inputStream=new ClassPathResource("teams_data.json").getInputStream();


        MDTeam[] data = mapper.readValue(inputStream, MDTeam[].class);

        System.out.println("count="+data.length);

        return "tested ok";
    }
    @GetMapping("loadregions")
    public String loadregions() throws IOException {
        ObjectMapper mapper = new ObjectMapper();


        InputStream inputStream=new ClassPathResource("regions_data.json").getInputStream();


        MDRegion[] data = mapper.readValue(inputStream, MDRegion[].class);

        System.out.println("count="+data.length);

        return "tested ok";
    }
}
