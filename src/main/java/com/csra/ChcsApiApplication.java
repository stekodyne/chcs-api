package com.csra;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.regex;

@SpringBootApplication
public class ChcsApiApplication {

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

	@Bean
	public Docket patientApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Patient")
				.apiInfo(apiInfo())
				.select()
				.paths(regex("/fhir/Patient.*"))
				.build()
				.directModelSubstitute(com.csra.fhir.Extension.class, Void.class);
	}

	@Bean
	public Docket stubApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("stub")
				.apiInfo(apiInfo())
				.select()
				.paths(regex("/fhir/stub.*"))
				.build();
	}

	@Bean
	public Docket medicationApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("MedicationOrder")
				.apiInfo(apiInfo())
				.select()
				.paths(regex("/fhir/MedicationOrder.*"))
				.build()
				.directModelSubstitute(com.csra.fhir.Extension.class, Void.class);
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("CHCS API")
				.description("CHCS Spring REST API with Swagger")
				.termsOfServiceUrl("http://www-03.ibm.com/software/sla/sladb.nsf/sla/bm?Open")
				.contact("Steffen Kory")
				.license("Apache License Version 2.0")
				.licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE")
				.version("2.0")
				.build();
	}

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ChcsApiApplication.class);
		application.run(args);
	}

}
