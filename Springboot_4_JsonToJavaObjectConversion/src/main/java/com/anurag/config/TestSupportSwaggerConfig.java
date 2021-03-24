package com.anurag.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class TestSupportSwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.anurag.testsupport"))
                .paths(PathSelectors.any())
                .build()
                .tags(
                        new Tag("TestSupportTxClient", "TestSupportTxClient for json to java objects")
                        //another tag
                )
                .apiInfo(apiInfo())
                .groupName("internal api");
    }

    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("json to java object conversion")
                .build();
    }

}
