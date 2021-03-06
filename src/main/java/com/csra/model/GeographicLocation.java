package com.csra.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by steffen on 12/21/16.
 */
@Entity(name = "GeographicLocation")
@Table(name = "geographic_location", schema = "com_qbase_jp_chcs")
@Data
@EqualsAndHashCode(callSuper = false)
public class GeographicLocation extends ChcsModel {

    @Id
    @Column(name = "ien")
    private String ien;

    @Column(name = "name")
    private String name;

    @Column(name = "abbreviation")
    private String abbreviation;

}
