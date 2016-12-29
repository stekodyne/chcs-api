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
@Entity(name="QbasePatientEventMonitoring")
@Table(name="qbase_patient_event_monitoring", schema = "com_qbase_jp_chcs")
@Data
public class QbasePatientEventMonitoring {

    @Id
    @Column(name="ien")
    String ien;

    @Column(name="name")
    String name;

    @Column(name="new_event")
    @Type(type="date")
    private Date newEvent;

}
