package com.csra.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by steffen on 12/24/16.
 */
@Entity(name="BloodPressureDevices")
@Table(name="blood_pressure_devices", schema = "com_qbase_jp_chcs")
@Data
@EqualsAndHashCode(callSuper=false)
public class BloodPressureDevices extends ChcsModel {

    @Id
    @Column(name="ien")
    String ien;

    @OneToOne(optional=false)
    @JoinColumn(name = "qbase_patient_event_monitoring", referencedColumnName="ien")
    private Device qbasePatientEventMonitoring;

    @Column(name="iens")
    String iens;

    @Column(name="blood_pressure_devices")
    String bloodPressuredDevices;

}
