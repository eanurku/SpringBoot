package com.anurag;

import com.anurag.controller.HomeController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GreetingController.class)
public class SliceTestWeblayerOnlyWithMockBean {

    @Autowired
    MockMvc mockmvc;

    @MockBean
    GreetingService greetingService;

//    @Autowired
//    HomeController homeController;

    @Autowired
    GreetingController greetingController;

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void verifyWebApplicationContextIsLoaded() {

        Assertions.assertThat(applicationContext).isNotNull();
        Assertions.assertThat(greetingController).isNotNull();
        //ERROR : app context created for greetingController only
        //Assertions.assertThat(homeController).isNotNull();

    }

    @Test
    public void verifyGreetingApi_should_returnMessage() throws Exception {

        when(greetingService.getGreeting()).thenReturn("greeting");
        this.mockmvc.perform(get("/greeting"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("greeting"));
    }

}
