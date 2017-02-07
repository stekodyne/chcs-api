package com.csra.utility.fhir;

import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.primitive.UriDt;
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

        public final ResourceReferenceDt reference;

        Profile(Uri reference) {
            this.reference = new ResourceReferenceDt();
            this.reference.setReference(reference.uri.getValue());
        }
    }

    public enum Uri {

        CHCSAPI_PATIENT("ChcsApiPatient"),
        CHCSAPI_MEDICATIONORDER("ChcsApiMedicationOrder"),
        CHCSAPI_DEVICEMETRIC("ChcsApiDeviceMetric"),
        CHCSAPI_OBSERVATION("ChcsApiObservation"),
        CHCSAPI_CONFORMANCE("ChcsApiConformance");

        public final ca.uhn.fhir.model.primitive.UriDt uri;

        Uri(String uri) {
            this.uri = new UriDt();
            this.uri.setValue(uri);
        }
    }
}
