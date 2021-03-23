package com.anurag.testsupport;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/tx")
public class TestSupportTxClient {

    @Value("${groups_url}")
    String rootUrl;

    @GetMapping(value = "test")
    public String test(){
        return "tested Ok";
    }

    @GetMapping(value = "groups")
    public String getgroups(){
        RestTemplate restTemplate=new RestTemplate();
        String groups = restTemplate.getForObject(rootUrl, String.class);

        return groups;
    }

}
