package com.hms.model;

import com.hms.constants.Status;

import java.util.Date;

public class CreateAppointmentParams {
    private String userId;
    private String patientId;
    private String primaryPhysician;
    private String reason;
    private Date schedule;
    private Status status;
    private String note;

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
