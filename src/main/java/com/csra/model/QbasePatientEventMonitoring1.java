package com.csra.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by steffen on 12/24/16.
 */
@Entity(name="QbasePatientEventMonitoring1")
@Table(name="qbase_patient_event_monitoring_1", schema = "com_qbase_jp_chcs")
@Data
public class QbasePatientEventMonitoring1 {

    @Id
    @Column(name="ien")
    String ien;

    @Column(name="name")
    String name;

    @Column(name="serial_number")
    String serialNumber;

    @Column(name="device_Manufacturer")
    String deviceManufacturer;

}
