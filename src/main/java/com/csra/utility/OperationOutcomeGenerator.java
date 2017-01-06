package com.csra.utility;

import com.csra.fhir.CodeableConcept;
import com.csra.fhir.Coding;
import com.csra.fhir.IssueType;
import com.csra.fhir.IssueTypeList;
import com.csra.fhir.OperationOutcome;
import com.csra.fhir.OperationOutcomeIssue;

import java.util.UUID;

/**
 * Created by steffen on 1/3/17.
 */
public class OperationOutcomeGenerator {
    public static OperationOutcome generate(String message, IssueTypeList issueTypeList) {
        OperationOutcome operationOutcome = new OperationOutcome();
        OperationOutcomeIssue operationOutcomeIssue = new OperationOutcomeIssue();
        UUID uuid = UUID.randomUUID();
        Coding coding = new Coding();
        IssueType issueType = new IssueType();
        CodeableConcept codeableConcept = new CodeableConcept();

        operationOutcomeIssue.setId(uuid.toString());
        issueType.setValue(issueTypeList);
        operationOutcomeIssue.setCode(issueType);
        coding.setCode(issueType.toString());
        coding.setDisplay(message);
        codeableConcept.getCoding().add(coding);
        operationOutcomeIssue.setDetails(codeableConcept);
        operationOutcome.setId(uuid.toString());
        operationOutcome.getIssue().add(operationOutcomeIssue);
        return operationOutcome;
    }
}
