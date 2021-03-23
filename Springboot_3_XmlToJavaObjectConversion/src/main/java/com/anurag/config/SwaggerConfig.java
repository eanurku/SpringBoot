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
public class SwaggerConfig {

    @Bean
    Docket api() {

        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.anurag.testsupport"))
                .paths(PathSelectors.any())
                .build()
                .tags(new Tag("XmlToJavaConversion", "convert xml to java"))
                .groupName("internal test api")
                .apiInfo(apiInfo());

    }

    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Services For Xml,Json to java objects Conversion")
                .version("1.0")
                .description("conversion services")
                .build();

    }

}
