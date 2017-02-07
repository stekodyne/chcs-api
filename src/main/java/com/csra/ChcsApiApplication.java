package com.csra;

import ca.uhn.fhir.context.FhirContext;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qbase.legacy.api.RepositoryFactory;
import com.qbase.legacy.api.repository.IRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import javax.xml.datatype.XMLGregorianCalendar;

import static springfox.documentation.builders.PathSelectors.regex;

@SpringBootApplication
public class ChcsApiApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ChcsApiApplication.class);
        application.run(args);
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

    @Bean
    public FhirContext fhirContext() {
        FhirContext fhirContext = FhirContext.forDstu2();
        return fhirContext;
    }

    @Bean
    public IRepository chcsRepository() throws Exception {
        return (IRepository) new RepositoryFactory().getRepository("chcs", "jp");
    }

    @Bean
    public Docket patientApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Patient")
                .apiInfo(apiInfo("FHIR/CHCS Patient API", "Spring-based FHIR REST API with a little Swagger!"))
                .select()
                .paths(regex("/fhir/Patient.*"))
                .build()
                .directModelSubstitute(XMLGregorianCalendar.class, String.class);
    }

    @Bean
    public Docket medicationApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("MedicationOrder")
                .apiInfo(apiInfo("FHIR/CHCS MedicationOrder API", "Spring-based FHIR REST API with a little Swagger!"))
                .select()
                .paths(regex("/fhir/MedicationOrder.*"))
                .build()
                .directModelSubstitute(XMLGregorianCalendar.class, String.class);
    }

    @Bean
    public Docket observationApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Observation")
                .apiInfo(apiInfo("FHIR/CHCS Observation API", "Spring-based FHIR REST API with a little Swagger!"))
                .select()
                .paths(regex("/fhir/Observation.*"))
                .build()
                .directModelSubstitute(XMLGregorianCalendar.class, String.class);
    }

    @Bean
    public Docket deviceMetricApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("DeviceMetric")
                .apiInfo(apiInfo("FHIR/CHCS DeviceMetric API", "Spring-based FHIR REST API with a little Swagger!"))
                .select()
                .paths(regex("/fhir/DeviceMetric.*"))
                .build()
                .directModelSubstitute(XMLGregorianCalendar.class, String.class);
    }

    @Bean
    public Docket conformanceApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Conformance")
                .apiInfo(apiInfo("FHIR Conformance API", "Spring-based FHIR REST API with a little Swagger!"))
                .select()
                .paths(regex("/fhir/Conformance.*"))
                .build()
                .directModelSubstitute(XMLGregorianCalendar.class, String.class);
    }

    private ApiInfo apiInfo(String title, String description) {
        return new ApiInfoBuilder()
                .title(title)
                .description(description)
                .termsOfServiceUrl("http://www-03.ibm.com/software/sla/sladb.nsf/sla/bm?Open")
                .contact("Steffen Kory")
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE")
                .version("2.0")
                .build();
    }

}
