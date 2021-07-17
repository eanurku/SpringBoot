package com.anurag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/elastic")
public class controller {

    @Autowired
    ArticleRepository articleRepository;

    @GetMapping(value = "test")
    public String test(){
        return "tested ok";
    }


    @GetMapping(value = "test1")
    public  void test1() {
        Article article = new Article("123","Spring Data Elasticsearch");
        articleRepository.save(article);
    }


}
