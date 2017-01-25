package com.csra;

import com.csra.jackson.module.FhirBooleanModule;
import com.csra.jackson.module.FhirCodeModule;
import com.csra.jackson.module.FhirCodingModule;
import com.csra.jackson.module.FhirDateTimeModule;
import com.csra.jackson.module.FhirIdModule;
import com.csra.jackson.module.FhirIntegerModule;
import com.csra.jackson.module.FhirMedicationOrderStatusModule;
import com.csra.jackson.module.FhirReferenceModule;
import com.csra.jackson.module.FhirResourceContainerModule;
import com.csra.jackson.module.FhirStringModule;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
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

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        AnnotationIntrospector jaxbAnnotationIntrospector = new JaxbAnnotationIntrospector(objectMapper.getTypeFactory());
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setAnnotationIntrospector(jaxbAnnotationIntrospector);

        objectMapper.registerModule(new FhirResourceContainerModule());
        objectMapper.registerModule(new FhirIdModule());
        objectMapper.registerModule(new FhirStringModule());
        objectMapper.registerModule(new FhirCodeModule());
        objectMapper.registerModule(new FhirCodingModule());
        objectMapper.registerModule(new FhirIntegerModule());
        objectMapper.registerModule(new FhirBooleanModule());
        objectMapper.registerModule(new FhirDateTimeModule());
        objectMapper.registerModule(new FhirReferenceModule());
        objectMapper.registerModule(new FhirMedicationOrderStatusModule());
        return objectMapper;
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
                .directModelSubstitute(com.csra.fhir.Extension.class, Void.class)
                .directModelSubstitute(XMLGregorianCalendar.class, String.class);
    }

    @Bean
    public Docket stubApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("stub")
                .apiInfo(apiInfo("FHIR Stub API", "Spring-based FHIR REST API with a little Swagger!"))
                .select()
                .paths(regex("/fhir/stub.*"))
                .build();
    }

    @Bean
    public Docket medicationApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("MedicationOrder")
                .apiInfo(apiInfo("FHIR/CHCS MedicationOrder API", "Spring-based FHIR REST API with a little Swagger!"))
                .select()
                .paths(regex("/fhir/MedicationOrder.*"))
                .build()
                .directModelSubstitute(com.csra.fhir.Extension.class, Void.class)
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
                .directModelSubstitute(com.csra.fhir.Extension.class, Void.class)
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
                .directModelSubstitute(com.csra.fhir.Extension.class, Void.class)
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
                .directModelSubstitute(com.csra.fhir.Extension.class, Void.class)
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

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ChcsApiApplication.class);
        application.run(args);
    }

}
