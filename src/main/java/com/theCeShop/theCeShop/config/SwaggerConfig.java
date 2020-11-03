package com.theCeShop.theCeShop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    //swagger ui URL: applicationUrl:port/swagger-ui.html
    //swagger documentation URL: applicationUrl:port/v2/api-docs

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("API References for the Ce SHop")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.theCeShop.theCeShop")).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("APIs")
                .description("API references for developers")
                .termsOfServiceUrl("https://theceshop.com")
                .contact("jeandelapaixd@gmail.com").license("The CE SHop License")
                .licenseUrl("robertrusarwa@gmail.com").version("1.0").build();
    }


}