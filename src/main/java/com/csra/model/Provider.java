package com.csra.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by steffen on 12/24/16.
 */
@Entity(name="Provider")
@Table(name="provider", schema = "com_qbase_jp_chcs")
@Data
public class Provider {

    @Id
    @Column(name="ien")
    String ien;

    @Column(name = "name")
    private String name;
}
