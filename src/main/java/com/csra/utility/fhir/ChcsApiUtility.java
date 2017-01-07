package com.csra.utility.fhir;

import com.csra.fhir.Id;
import com.csra.fhir.Reference;
import com.csra.fhir.Uri;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by steffen on 1/6/17.
 */
public abstract class ChcsApiUtility {

    private static Logger log = LoggerFactory.getLogger(ChcsApiUtility.class);

    public enum PROFILEs {

        FORECAST_IMPLEMENTATIONGUIDE(URIs.FORECAST_IMPLEMENTATIONGUIDE), FORECAST_PATIENT(
                URIs.FORECAST_PATIENT), FORECAST_IMMUNIZATION(
                URIs.FORECAST_IMMUNIZATION), FORECAST_IMMUNIZATIONRECOMMENDATION(
                URIs.FORECAST_IMMUNIZATIONRECOMMENDATION), FORECAST_IMMUNIZATIONRECOMMENDATIONRECOMMENDATION(
                URIs.FORECAST_IMMUNIZATIONRECOMMENDATIONRECOMMENDATION);

        public final Reference reference;

        PROFILEs(URIs reference) {
            this.reference = (Reference) ObjectFactory.getObject("reference");
            this.reference.setId(FhirUtility.createId().getValue());
            this.reference.setReference(reference.uri.getValue());
        }
    }

    public enum URIs {

        FORECAST_IMPLEMENTATIONGUIDE("ForecastImplementationGuide"), FORECAST_PATIENT(
                "ForecastPatient"), FORECAST_IMMUNIZATION(
                "ForecastImmunization"), FORECAST_IMMUNIZATIONRECOMMENDATION(
                "ForecastImmunizationRecommendation"), FORECAST_IMMUNIZATIONRECOMMENDATIONRECOMMENDATION(
                "ForecastImmunizationRecommendationRecommendation"), FORECAST_CONFORMANCE(
                "Conformance");

        public final Uri uri;

        URIs(String uri) {
            this.uri = (Uri) ObjectFactory.getObject("uri");
            this.uri.setId(((Id) ObjectFactory.getObject("Id")).getValue());
            this.uri.setValue(uri);
        }
    }
}
