package com.anurag.config;

import com.anurag.clients.RestClientForXmlToJava;
import com.anurag.testsupport.TestTxClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ClientConfig {

    @Bean
    RestClientForXmlToJava restClientForXmlToJava(RestTemplate restTemplate,@Value("${groups_url}") String rooturl) {
        return new RestClientForXmlToJava(restTemplate,rooturl);
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    TestTxClient testTxClient(RestClientForXmlToJava restClientForXmlToJava) {
        return new TestTxClient(restClientForXmlToJava);
    }
}
