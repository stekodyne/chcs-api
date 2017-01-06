package com.csra.model;

import lombok.Data;
import org.hibernate.annotations.Type;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by steffen on 12/21/16.
 *
 */
@Entity(name="Patient")
@Table(name="patient", schema = "com_qbase_jp_chcs")
@Data
public class Patient {

    @Id
    @Column(name="patient_identifier")
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="ien")
    private String ien;

    @Column(name="ssn")
    private String ssn;

    @Column(name="sex")
    private String sex;

    @Column(name="dob")
    @Type(type="date")
    private Date dateOfBirth;

    @Column(name="street_address")
    private String streetAddress;

    @Column(name="city")
    private String city;

    @OneToOne(optional=false)
    @JoinColumn(name = "state", referencedColumnName="ien")
    private GeographicLocation state;

    @Column(name="zip_code")
    private String zipCode;

    @Column(name="phone")
    private String phone;

    @Column(name="office_phone")
    private String officePhone;

    @OneToOne(optional=true)
    @JoinColumn(name = "marital_status", referencedColumnName="ien")
    private MaritalStatus maritalStatus;

    @OneToOne(optional=false, fetch=FetchType.LAZY)
    @JoinColumn(name = "race", referencedColumnName="ien")
    private Race race;

    @Column(name="pob_city")
    private String pobCity;

    @OneToOne(optional=false)
    @JoinColumn(name = "pob_state", referencedColumnName="ien")
    private GeographicLocation pobState;
}
