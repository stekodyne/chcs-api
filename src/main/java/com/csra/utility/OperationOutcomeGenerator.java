package com.csra.utility;

import com.csra.fhir.Coding;
import com.csra.fhir.IssueTypeList;
import com.csra.fhir.OperationOutcome;
import com.csra.fhir.OperationOutcomeIssue;

import java.util.UUID;

/**
 * Created by steffen on 1/3/17.
 */
public class OperationOutcomeGenerator {
    public static OperationOutcome generate(String message, IssueTypeList issueType) {
        OperationOutcome operationOutcome = new OperationOutcome();
        OperationOutcomeIssue operationOutcomeIssue = new OperationOutcomeIssue();
        UUID uuid = UUID.randomUUID();
        Coding coding = new Coding();

        operationOutcomeIssue.setId(uuid.toString());
        operationOutcomeIssue.getCode().setValue(issueType);
        coding.setCode(issueType.toString());
        coding.setDisplay(message);
        operationOutcomeIssue.getDetails().getCoding().add(coding);
        operationOutcome.setId(uuid.toString());
        operationOutcome.getIssue().add(operationOutcomeIssue);
        return operationOutcome;
    }
}
