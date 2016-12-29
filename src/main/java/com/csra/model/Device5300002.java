package com.csra.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by steffen on 12/24/16.
 */
@Entity(name="Device5300002")
@Table(name="device_53000_02", schema = "com_qbase_jp_chcs")
@Data
public class Device5300002 {

    @Id
    @Column(name="ien")
    String ien;

    @OneToOne(optional=false)
    @JoinColumn(name = "blood_pressure_devices", referencedColumnName="ien")
    private Device bloodPressureDevices;

    @OneToOne(optional=false)
    @JoinColumn(name = "device", referencedColumnName="ien")
    private Device device;

    @Column(name="serial_number")
    String serialNumber;

    @Column(name="coding_system")
    String condingSystem;

}
