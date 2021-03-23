package com.anurag.testsupport;

import com.anurag.clients.RestClientForXmlToJava;
import com.anurag.xml.groups.Groups;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tx")
public class TestTxClient {

    RestClientForXmlToJava restClientForXmlToJava;

    public TestTxClient(RestClientForXmlToJava restClientForXmlToJava) {
        this.restClientForXmlToJava = restClientForXmlToJava;
    }

    @GetMapping(value = "test")
    public String test() {
        return "tested ok";
    }

    @GetMapping(value = "groups")
    public Groups getGroups(@RequestParam("groupName") String groupName) {

        Groups groups = restClientForXmlToJava.convertFromXmlToObject(groupName);
        return groups;
    }

}
