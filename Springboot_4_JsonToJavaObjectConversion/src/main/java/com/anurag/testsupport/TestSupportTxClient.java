package com.anurag.testsupport;

import com.anurag.json.Groups;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/tx",produces = {"application/json"})
@Api(value = "TestSupportTxClient")
public class TestSupportTxClient {

    @Value("${groups_url}")
    String rootUrl;
    RestTemplate restTemplate;

    public TestSupportTxClient(String rootUrl, RestTemplate restTemplate) {
        this.rootUrl = rootUrl;
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "test")
    public String test() {
        return "tested Ok";
    }

    @GetMapping(value = "groups")
    public Groups getgroups(@RequestParam("groupName") String groupName) {

        String url = rootUrl + groupName;
        Groups groups = restTemplate.getForObject(rootUrl + groupName, Groups.class);

        return groups;
    }

}
