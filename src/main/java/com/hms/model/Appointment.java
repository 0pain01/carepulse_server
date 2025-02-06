package com.hms.model;

import com.hms.constants.Status;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    private Date schedule;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String primaryPhysician;
    private String reason;
    private String note;
    private String cancellationReason;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public Appointment(String id, Patient patient, Date schedule, Status status, String primaryPhysician, String reason,
			String note, String cancellationReason) {
		super();
		this.id = id;
		this.patient = patient;
		this.schedule = schedule;
		this.status = status;
		this.primaryPhysician = primaryPhysician;
		this.reason = reason;
		this.note = note;
		this.cancellationReason = cancellationReason;
	}
    
    

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setId(String id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getSchedule() {
        return schedule;
    }

    public void setSchedule(Date schedule) {
        this.schedule = schedule;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getPrimaryPhysician() {
        return primaryPhysician;
    }

    public void setPrimaryPhysician(String primaryPhysician) {
        this.primaryPhysician = primaryPhysician;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }
}
