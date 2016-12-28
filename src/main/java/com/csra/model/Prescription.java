package com.csra.model;

import lombok.Data;
import org.hibernate.annotations.Type;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by steffen on 12/24/16.
 */
@Entity(name="Prescription")
@Table(name="prescription", schema = "com_qbase_jp_chcs")
@Data
public class Prescription {

    @Id
    @Column(name="ien")
    String ien;

    @OneToOne(optional=false, fetch=FetchType.LAZY)
    @JoinColumn(name = "patient", referencedColumnName="ien")
    private Patient patient;

    @OneToOne(optional=false)
    @JoinColumn(name = "drug", referencedColumnName="ien")
    private Drug drug;

    @Column(name="qty")
    Integer quanity;

    @Column(name="days_supply")
    Integer daysSupply;

    @Column(name="refills")
    Integer refills;

    @Column(name="status")
    String status;

    @Column(name="refills_remaining")
    Integer refillsRemaining;

    @Column(name="last_fill_date")
    @Type(type="date")
    private Date lastFillDate;

    @Column(name="fill_expiration")
    @Type(type="date")
    private Date fillExpiration;

    @Column(name="order_datetime")
    @Type(type="date")
    private Date orderDatetime;

    @OneToOne(optional=false)
    @JoinColumn(name = "order_pointer", referencedColumnName="ien")
    Order order;
}
