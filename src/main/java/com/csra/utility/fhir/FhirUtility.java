package com.csra.utility.fhir;

import com.csra.fhir.Code;
import com.csra.fhir.Coding;
import com.csra.fhir.Date;
import com.csra.fhir.DateTime;
import com.csra.fhir.Decimal;
import com.csra.fhir.Id;
import com.csra.fhir.Identifier;
import com.csra.fhir.Instant;
import com.csra.fhir.SimpleQuantity;
import com.csra.fhir.Uri;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

/**
 * Created by steffen on 1/6/17.
 */
public abstract class FhirUtility {

    private static Logger log = LoggerFactory.getLogger(FhirUtility.class);

    public final static Id FHIR_VERSION = createFhirVersion();

    public enum AGGREGATION {
        CONTAINED("contained"), REFERENCED("referenced"), BUNDLED("bundled");

        public final java.lang.String code;

        AGGREGATION(java.lang.String code) {
            this.code = code;
        }
    }

    public enum FORMAT {
        JSON("json"), XML("xml");

        public final Code code;

        FORMAT(java.lang.String code) {
            this.code = (Code) ObjectFactory.getObject("code");
            this.code.setId(createId().getValue());
            this.code.setValue(code);
        }
    }

    public enum CONFORMANCE_STATUS {
        DRAFT("draft"), ACTIVE("active"), RETIRED("retired");

        public final Code code;

        CONFORMANCE_STATUS(java.lang.String code) {
            this.code = (Code) ObjectFactory.getObject("code");
            this.code.setId(createId().getValue());
            this.code.setValue(code);
        }
    }

    public enum IMMUNIZATION_STATUS {
        IN_PROGRESS("in-progress", "In Progress"), ON_HOLD("on-hold", "On Hold"), COMPLETED("completed", "Completed"), ENTERED_IN_ERROR("entered-in-error", "Entered in Error"), STOPPED("stopped", "Stopped");

        public final Coding coding;

        IMMUNIZATION_STATUS(java.lang.String s, java.lang.String display) {
            this.coding = (Coding) ObjectFactory.getObject("coding");
            Code code = (Code) ObjectFactory.getObject("code");
            code.setId(createId().getValue());
            code.setValue(s);
            coding.setSystem(createUri("http://hl7.org/fhir/immunization-status"));
            coding.setCode(code.getValue());
            coding.setDisplay(display);
        }
    }

    public enum IMMUNIZATION_RECOMMENDATION_STATUS {
        DUE("due"), OVERDUE("overdue");

        public final Coding coding;

        IMMUNIZATION_RECOMMENDATION_STATUS(java.lang.String value) {
            this.coding = (Coding) ObjectFactory.getObject("coding");
            Code code = (Code) ObjectFactory.getObject("code");
            code.setId(createId().getValue());
            code.setValue(value);
            coding.setCode(code.getValue());
        }
    }

    public enum IMMUNIZATION_RECOMMENDATION_DATE_CRITERION {
        DUE("due", "Due Date"), RECOMMENDED("reommended", "Recommended Date"), EARLIEST("earliest", "Earliest Date"), OVERDUE("overdue", "Past Due Date"), LATEST("latest", "Latest Date");

        public final Coding coding;

        IMMUNIZATION_RECOMMENDATION_DATE_CRITERION(java.lang.String s, java.lang.String display) {
            this.coding = (Coding) ObjectFactory.getObject("coding");
            Code code = (Code) ObjectFactory.getObject("code");
            code.setId(createId().getValue());
            code.setValue(s);
            coding.setSystem(createUri("http://hl7.org/fhir/immunization-recommendation-date-criterion"));
            coding.setCode(code.getValue());
            coding.setDisplay(display);
        }
    }

    public enum BOOLEAN {

        TRUE(true), FALSE(false);

        public final com.csra.fhir.Boolean bool;

        BOOLEAN(java.lang.Boolean bool) {
            this.bool = (com.csra.fhir.Boolean) ObjectFactory.getObject("boolean");
            this.bool.setValue(bool);
        }
    }

    public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");

    public static Instant createInstant(java.util.Date date) {
        Instant instant = (Instant) ObjectFactory.getObject("instant");
        instant.setValue(dateToXMLCalendar(date));
        return instant;
    }

    public static Instant createInstant(java.lang.String value) {
        Instant instant = (Instant) ObjectFactory.getObject("instant");
        instant.setValue(stringToXMLCalendar(value));
        return instant;
    }

    public static Id createId(java.lang.String sId) {
        Id id = (Id) ObjectFactory.getObject("id");
        id.setValue(sId);
        return id;
    }

    public static Id createId() {
        Id id = (Id) ObjectFactory.getObject("id");
        id.setValue(UUID.randomUUID().toString());
        return id;
    }

    public static Id createFhirVersion() {
        Id id = (Id) ObjectFactory.getObject("id");
        id.setId(createId().getId());
        id.setValue("DSTU2");
        return id;
    }

    public static Identifier createIdentifier() {
        Identifier identifier = (Identifier) ObjectFactory.getObject("identifier");
        identifier.setId(createUuid().toString());
        identifier.setValue(createUuid());
        return identifier;
    }

    public static String createUuid() {
        return UUID.randomUUID().toString();
    }

    public static com.csra.fhir.String convert(java.lang.String i) {
        com.csra.fhir.String s = (com.csra.fhir.String) ObjectFactory.getObject("string");
        s.setValue(i);
        return s;
    }

    public static Uri createUri(java.lang.String s) {
        Uri uri = (Uri) ObjectFactory.getObject("uri");
        uri.setValue(s);
        return uri;
    }

    public static String createUrn(Identifier i) {
        return createUrn(i.getValue());
    }

    public static String createUrn(String input) {
        java.lang.String output = "urn:uuid:" + input;
        return output;
    }

    public static SimpleQuantity createQuantity(BigDecimal input) {
        SimpleQuantity quantity = (SimpleQuantity) ObjectFactory.getObject("simplequantity");

        Decimal decimal = (Decimal) ObjectFactory.getObject("decimal");
        decimal.setValue(input);
        quantity.setValue(decimal);

        return quantity;
    }

    public static Date convert(java.util.Date input) {
        XMLGregorianCalendar xmlGregorianCalendar = checkDateInput(input);

        Date output = (Date) ObjectFactory.getObject("date");
        output.setValue(xmlGregorianCalendar.toString());

        return output;
    }

    public static java.util.Date convert(com.csra.fhir.Date input) throws ParseException {
        return sdf.parse(input.getValue().toString());
    }

    public static java.util.Date convert(DateTime input) {
        XMLGregorianCalendar xmlGregorianCalendar = stringToXMLCalendar(input.getValue());
        return xmlGregorianCalendar.toGregorianCalendar().getTime();
    }

    public static DateTime convertDateTime(java.util.Date input) {
        XMLGregorianCalendar xmlGregorianCalendar = checkDateInput(input);

        DateTime output = (DateTime) ObjectFactory.getObject("datetime");
        output.setValue(xmlGregorianCalendar.toString());

        return output;
    }

    public static XMLGregorianCalendar stringToXMLCalendar(java.lang.String input) {
        XMLGregorianCalendar output = null;

        try {
            output = DatatypeFactory.newInstance().newXMLGregorianCalendar(input);
        } catch (DatatypeConfigurationException e) {
            log.error("{}", e);
        }

        return output;
    }

    public static XMLGregorianCalendar dateToXMLCalendar(java.util.Date input) {
        XMLGregorianCalendar output = null;

        try {
            Calendar calendar = GregorianCalendar.getInstance();
            calendar.setTime(input);
            output = DatatypeFactory.newInstance().newXMLGregorianCalendar((GregorianCalendar) calendar);
        } catch (DatatypeConfigurationException e) {
            log.error("{}", e);
        }

        return output;
    }

    public static XMLGregorianCalendar checkDateInput(java.util.Date input) {
        XMLGregorianCalendar output = null;

        if (input == null) {
            return null;
        }

        try {
            Calendar calendar = GregorianCalendar.getInstance();
            calendar.setTime(input);
            output = DatatypeFactory.newInstance().newXMLGregorianCalendar((GregorianCalendar) calendar);
        } catch (DatatypeConfigurationException e) {
            log.error("{}", e);
        }

        return output;
    }
}
