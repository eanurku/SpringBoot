package com.anurag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootApplication
public class SwaggerApp {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerApp.class);

//        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl("http://localhost:8201" + "/api/runningball/");
//        uriBuilder.pathSegment("sport", String.valueOf(12)) //
//                .pathSegment("league", String.valueOf(34));


        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl("http://localhost:8201" + "/api/runningball/");
        uriBuilder.pathSegment("sport", String.valueOf(12))
                .path("score")
                .pathSegment("fixtureId", String.valueOf(22333));


        System.out.println(uriBuilder.build().toString());

    }
}
