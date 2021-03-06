package com.n26.Config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * @author Varadharajan on 2019-09-28 00:53
 * @project name: coding-challenge
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("public-api").apiInfo(apiInfo()).select()
                .paths(postPaths()).build();
    }

    @SuppressWarnings("unchecked")
    private Predicate<String> postPaths() {
        return or(regex("/api/posts.*"), regex("/transactions"), regex("/statistics"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("JavaInUse API").description("JavaInUse API reference for developers")
                .termsOfServiceUrl("http://google.com").license("N26 code challenge").licenseUrl("varathu09@gmail.com")
                .version("1.0").build();
    }

}
