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
@Entity(name = "Device5300002")
@Table(name = "device_53000_02", schema = "com_qbase_jp_chcs")
@Data
@EqualsAndHashCode(callSuper = false)
public class Device5300002 extends ChcsModel {

    @Id
    @Column(name = "ien")
    String ien;
    @Column(name = "serial_number")
    String serialNumber;
    @Column(name = "coding_system")
    String condingSystem;
    @OneToOne(optional = false)
    @JoinColumn(name = "blood_pressure_devices", referencedColumnName = "ien")
    private Device bloodPressureDevices;
    @OneToOne(optional = false)
    @JoinColumn(name = "device", referencedColumnName = "ien")
    private Device device;

}
