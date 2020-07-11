package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIT {

    @LocalServerPort
    private String port;

    private URL base;

    @Autowired
    TestRestTemplate template;

    @BeforeEach
    public void setup() throws MalformedURLException {
        this.base=new URL("http://localhost:"+port+"/");
    }

    @Test
    public void test(){

        ResponseEntity<String> result = template.getForEntity(base.toString(), String.class);
        Assertions.assertEquals("OK",result.getBody());


    }

}
