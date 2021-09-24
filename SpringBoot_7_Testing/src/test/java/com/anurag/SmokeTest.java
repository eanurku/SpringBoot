package com.anurag;

import com.anurag.controller.HomeController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class SmokeTest {

    @Autowired
     HomeController homeController;

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void verifyWebApplicationContextIsLoaded(){

        Assertions.assertThat(applicationContext).isNotNull();
        Assertions.assertThat(homeController).isNotNull();


    }

}
