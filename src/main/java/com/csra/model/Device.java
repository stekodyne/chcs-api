package com.csra.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by steffen on 12/24/16.
 */
@Entity(name="Device")
@Table(name="device", schema = "com_qbase_jp_chcs")
@Data
public class Device {

    @Id
    @Column(name="ien")
    String ien;

    @Column(name="name")
    String name;

    @Column(name="type")
    String type;

    @Column(name="subtype")
    String subtype;

}
