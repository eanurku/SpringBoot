package com.anurag;

import com.anurag.controller.HomeController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
//spring boot server is not started but only creating ApplicationContext
public class SliceTestByStartingOnlySpringApplicationContext {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    HomeController     homeController;
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void verifyWebApplicationContextIsLoaded() {

        Assertions.assertThat(applicationContext).isNotNull();
        Assertions.assertThat(homeController).isNotNull();

    }

    @Test
    public void verifyTestApi_returnMessage() throws Exception {

        this.mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("test"));

    }

    @Test
    public void verifyTestApi_returnMessage_failure() throws Exception {

        this.mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("t4est"));

    }

}
