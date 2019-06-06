package com.minerav.smcommon.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.swagger.annotations.Api;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@ComponentScan(basePackages= {"com.minerav.smcommon"})
@EnableJpaRepositories(basePackages={"com.minerav.smlib.repository","com.minerav.smcommon.repository"} )
@EntityScan(basePackages= {"com.minerav.smlib.domain","com.minerav.smcommon.domain"})
@EnableSwagger2
public class CommonConfiguration {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}
	
	@SuppressWarnings("deprecation")
	@Bean
	public ApiInfo apiInfo() {
		return new ApiInfo("Society Maintenance Application",
				"Common APIs for Society Maintenance Application", 
				"0.0.1-SNAPSHOT", "Terms & Conditions as per Minerav", "Nirav @ nirav.ce41@gmail.com", "","");
	}
}
