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
 * Created by steffen on 12/24/16.
 */
@Entity(name="EventDatatime")
@Table(name="event_datetime", schema = "com_qbase_jp_chcs")
@Data
public class EventDatatime {

    @Id
    @Column(name="ien")
    String ien;

    @OneToOne(optional=false)
    @JoinColumn(name = "device_53000_02", referencedColumnName="ien")
    private Device5300002 device5300002;

    @Column(name="event_datetime")
    @Type(type="date")
    private Date eventDatetime;

    @OneToOne(optional=false)
    @JoinColumn(name = "provider", referencedColumnName="ien")
    private Provider provider;

    @Column(name="systolic_result")
    Integer systolicResult;

    @Column(name="diastolic_result")
    Integer diastolicResult;

    @Column(name="test_accuracy")
    Integer testAccuracy;

}
