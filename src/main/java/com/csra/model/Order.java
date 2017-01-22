package com.csra.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by steffen on 12/24/16.
 */
@Entity(name="Order")
@Table(name="order", schema = "com_qbase_jp_chcs")
@Data
@EqualsAndHashCode(callSuper=false)
public class Order extends ChcsModel {

    @Id
    @Column(name="ien")
    String ien;

    @Column(name = "id_number")
    private String idNumber;

    @Column(name = "patient")
    private String patient;

}
