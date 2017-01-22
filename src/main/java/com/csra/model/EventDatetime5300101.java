package com.csra.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
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
@Entity(name="EventDatetime5300101")
@Table(name="event_datetime_53001_01", schema = "com_qbase_jp_chcs")
@Data
@EqualsAndHashCode(callSuper=false)
public class EventDatetime5300101 extends ChcsModel {

    @Id
    @Column(name="ien")
    String ien;

    @Column(name = "qbase_patient_event_monitoring_1")
    private String patient;

    @Column(name="event_datetime")
    @Type(type="date")
    private Date eventDatetime;

    @OneToOne(optional=false)
    @JoinColumn(name = "ordering_provider", referencedColumnName="ien")
    private Provider orderingProvider;

    @Column(name="device_types")
    String deviceTypes;

    @Column(name="results")
    String results;

    @Column(name="units")
    String units;

    @Column(name="iens")
    String iens;

}
