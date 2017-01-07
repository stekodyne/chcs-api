package com.csra.utility.fhir;

import com.csra.fhir.Code;
import com.csra.fhir.CodeableConcept;
import com.csra.fhir.Coding;
import com.csra.fhir.DateTime;
import com.csra.fhir.Decimal;
import com.csra.fhir.Id;
import com.csra.fhir.Identifier;
import com.csra.fhir.Instant;
import com.csra.fhir.IssueType;
import com.csra.fhir.IssueTypeList;
import com.csra.fhir.OperationOutcome;
import com.csra.fhir.OperationOutcomeIssue;
import com.csra.fhir.SimpleQuantity;
import com.csra.fhir.String;
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

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * Created by steffen on 1/6/17.
 */
public abstract class FhirUtility {

    private static Logger log = LoggerFactory.getLogger(FhirUtility.class);

    public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");

    public final static Id FHIR_VERSION = createFhirVersion();

    public enum Aggregation {
        CONTAINED("contained"), REFERENCED("referenced"), BUNDLED("bundled");

        public final java.lang.String code;

        Aggregation(java.lang.String code) {
            this.code = code;
        }
    }

    public enum Format {
        JSON("json"), XML("xml");

        public final Code code;

        Format(java.lang.String code) {
            this.code = (Code) ObjectFactory.getObject("code");
            this.code.setId(createId().getValue());
            this.code.setValue(code);
        }
    }

    public enum ConformanceStatus {
        DRAFT("draft"), ACTIVE("active"), RETIRED("retired");

        public final Code code;

        ConformanceStatus(java.lang.String code) {
            this.code = (Code) ObjectFactory.getObject("code");
            this.code.setId(createId().getValue());
            this.code.setValue(code);
        }
    }

    public enum MedicationOrderStatus {
        IN_PROGRESS("in-progress", "In Progress"),
        ON_HOLD("on-hold", "On Hold"),
        COMPLETED("completed", "Completed"),
        ENTERED_IN_ERROR("entered-in-error", "Entered in Error"),
        STOPPED("stopped", "Stopped");

        public final Coding coding;

        MedicationOrderStatus(java.lang.String value, java.lang.String display) {
            this.coding = (Coding) ObjectFactory.getObject("coding");
            Code code = (Code) ObjectFactory.getObject("code");
            code.setId(createId().getValue());
            code.setValue(value);
            this.coding.setSystem(createUri("http://hl7.org/fhir/immunization-status"));
            this.coding.setCode(code);
            this.coding.setDisplay(convert(display));
        }
    }

    public enum Boolean {

        TRUE(true), FALSE(false);

        public final com.csra.fhir.Boolean bool;

        Boolean(java.lang.Boolean bool) {
            this.bool = (com.csra.fhir.Boolean) ObjectFactory.getObject("boolean");
            this.bool.setValue(bool);
        }
    }

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

    public static Id createId(java.lang.String input) {
        Id id = (Id) ObjectFactory.getObject("id");
        id.setId(createUuid().getValue());
        id.setValue(input);
        return id;
    }

    public static com.csra.fhir.String createString(java.lang.String input) {
        com.csra.fhir.String output = (com.csra.fhir.String) ObjectFactory.getObject("string");
        output.setId(createUuid().getValue());
        output.setValue(input);
        return output;
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

    public static com.csra.fhir.String createUuid() {
        return convert(UUID.randomUUID().toString());
    }

    public static com.csra.fhir.String convert(java.lang.String input) {
        com.csra.fhir.String output = new com.csra.fhir.String();
        output.setId(createId().getValue());
        output.setValue(input);
        return output;
    }

    public static Uri createUri(java.lang.String s) {
        Uri uri = (Uri) ObjectFactory.getObject("uri");
        uri.setValue(s);
        return uri;
    }

    public static com.csra.fhir.String createUrn(Identifier input) {
        return createUrn(input.getValue());
    }

    public static com.csra.fhir.String createUrn(com.csra.fhir.String input) {
        java.lang.String output = "urn:uuid:" + input;
        return convert(output);
    }

    public static SimpleQuantity createQuantity(BigDecimal input) {
        SimpleQuantity quantity = (SimpleQuantity) ObjectFactory.getObject("simplequantity");

        Decimal decimal = (Decimal) ObjectFactory.getObject("decimal");
        decimal.setValue(input);
        quantity.setValue(decimal);

        return quantity;
    }

    public static Code createCode(java.lang.String value) {
        Code code = (Code) ObjectFactory.getObject("code");
        code.setId(createId().getValue());
        code.setValue(value);
        return code;
    }

    public static OperationOutcome createOperationOutcome(java.lang.String message, IssueTypeList issueTypeList) {
        OperationOutcome operationOutcome = (OperationOutcome) ObjectFactory.getObject("operationoutcome");
        OperationOutcomeIssue operationOutcomeIssue = (OperationOutcomeIssue) ObjectFactory.getObject("operationoutcomeissue");
        Coding coding = (Coding) ObjectFactory.getObject("coding");
        IssueType issueType = (IssueType) ObjectFactory.getObject("issuetype");
        CodeableConcept codeableConcept = (CodeableConcept) ObjectFactory.getObject("codeableconcept");

        operationOutcomeIssue.setId(createUuid().getValue());
        issueType.setValue(issueTypeList);
        operationOutcomeIssue.setCode(issueType);
        coding.setCode(createCode(issueType.getValue().value()));
        coding.setDisplay(convert(message));
        codeableConcept.getCoding().add(coding);
        operationOutcomeIssue.setDetails(codeableConcept);
        operationOutcome.setId(createId());
        operationOutcome.getIssue().add(operationOutcomeIssue);
        return operationOutcome;
    }

    public static com.csra.fhir.Date convert(java.util.Date input) {
        XMLGregorianCalendar xmlGregorianCalendar = checkDateInput(input);
        com.csra.fhir.Date output = (com.csra.fhir.Date) ObjectFactory.getObject("date");
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
