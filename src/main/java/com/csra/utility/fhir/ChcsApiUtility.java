package com.csra.utility.fhir;

import com.csra.fhir.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by steffen on 1/6/17.
 */
public abstract class ChcsApiUtility {

    private static Logger log = LoggerFactory.getLogger(ChcsApiUtility.class);

    public enum Profile {

        CHCSAPI_PATIENT(Uri.CHCSAPI_PATIENT),
        CHCSAPI_MEDICATIONORDER(Uri.CHCSAPI_MEDICATIONORDER),
        CHCSAPI_OBSERVATION(Uri.CHCSAPI_OBSERVATION),
        CHCSAPI_DEVICEMETRIC(Uri.CHCSAPI_DEVICEMETRIC);

        public final Reference reference;

        Profile(Uri reference) {
            this.reference = (Reference) ObjectFactory.getObject("reference");
            this.reference.setId(FhirUtility.createId().getValue());
            this.reference.setReference(FhirUtility.convert(reference.uri.getValue()));
        }
    }

    public enum Uri {

        CHCSAPI_PATIENT("ChcsApiPatient"),
        CHCSAPI_MEDICATIONORDER("ChcsApiMedicationOrder"),
        CHCSAPI_DEVICEMETRIC("ChcsApiDeviceMetric"),
        CHCSAPI_OBSERVATION("ChcsApiObservation"),
        CHCSAPI_CONFORMANCE("ChcsApiConformance");

        public final com.csra.fhir.Uri uri;

        Uri(String uri) {
            this.uri = (com.csra.fhir.Uri) ObjectFactory.getObject("uri");
            this.uri.setId(FhirUtility.createId().getValue());
            this.uri.setValue(uri);
        }
    }
}
