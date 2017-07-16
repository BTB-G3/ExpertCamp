package com.hrd.expertcamp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2

public class SwaggerConfiguration {
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()    
          .apis(RequestHandlerSelectors.basePackage("com.hrd.expertcamp"))
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build()
	      .apiInfo(apiInfo());                                   
    }
    
	
	private ApiInfo apiInfo() {
	  
		ApiInfo apiInfo = new ApiInfo(
	      "Spring RESTful Web Service",
	      "Korea Software HRD Center.",
	      "API Spring",
	      "Terms of service",
	      "Reksmey Mom - raksmeymom111@gmail.com",
	      "License of API",
	      "http://www.khmeracademy.org/");
	    return apiInfo;
	}
}
