package com.csra.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by steffen on 12/21/16.
 *
 */
@Entity(name="MaritalStatus")
@Table(name="marital_status", schema = "com_qbase_jp_chcs")
@Data
public class MaritalStatus {

    @Id
    @Column(name="ien")
    private String ien;

    @Column(name="name")
    private String name;

    @Column(name="abbreviation")
    private String abbreviation;

    @Column(name="deactivation_date")
    @Type(type="date")
    private Date deactivationDate;

}
