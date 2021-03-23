package com.anurag.clients;

import com.anurag.xml.groups.Groups;
import org.springframework.web.client.RestTemplate;

public class RestClientForXmlToJava {

    private RestTemplate restTemplate;
    String rootUrl;

    public RestClientForXmlToJava(RestTemplate restTemplate, String rootUrl) {
        this.restTemplate = restTemplate;
        this.rootUrl = rootUrl;
    }

    public Groups convertFromXmlToObject(String groupName) {

        String url = rootUrl + groupName;
        Groups groups = restTemplate.getForObject(url, Groups.class);

        return groups;
    }

}
