package com.csra.factory;

import com.csra.fhir.Patient;
import com.csra.utility.fhir.ObjectFactory;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

/**
 * Created by steffen on 12/11/16.
 */
public class ObjectFactoryTest {

    @Test
    public void testGetPatient() throws Exception {
        assertThat(ObjectFactory.getObject("patient"), instanceOf(Patient.class));
    }
}