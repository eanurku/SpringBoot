package com.anurag;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EndToEndTest {

    @LocalServerPort
    int port;
    @Autowired
    TestRestTemplate testRestTemplate;


    @Test
    public void verifytestApi_withSuccessfullReturnMessage(){

        ResponseEntity<String> response = this.testRestTemplate.getForEntity("http://localhost:" + port + "", String.class);

        System.out.println(response);
        Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        Assertions.assertThat(response.getBody()).isEqualTo("test");

    }

}
