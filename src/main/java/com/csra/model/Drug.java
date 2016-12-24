package com.csra.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by steffen on 12/24/16.
 */
@Entity(name="Drug")
@Table(name="drug", schema = "com_qbase_jp_chcs")
@Data
public class Drug {

    @Id
    @Column(name="ien")
    String ien;

    @Column(name = "name")
    private String name;

    @Column(name = "primary_ndc_number")
    private String primaryNdcNumber;

}
