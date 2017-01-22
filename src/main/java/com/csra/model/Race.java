package com.csra.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by steffen on 12/21/16.
 *
 */
@Entity(name="race")
@Table(name="race", schema = "com_qbase_jp_chcs")
@Data
@EqualsAndHashCode(callSuper=false)
public class Race extends ChcsModel{

    @Id
    @Column(name="ien")
    private String ien;

    @Column(name="code")
    private String code;

    @Column(name="description")
    private String description;

}
