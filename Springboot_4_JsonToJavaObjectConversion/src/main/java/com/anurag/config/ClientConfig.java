package com.anurag.config;

import com.anurag.testsupport.TestSupportTxClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ClientConfig {


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public TestSupportTxClient testSupportTxClient(@Value("${groups_url}") String rootUrl,RestTemplate restTemplate){
        return new TestSupportTxClient(rootUrl,restTemplate);
    }
}
