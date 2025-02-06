package com.hms.service;


import com.hms.model.Appointment;
import com.hms.model.Patient;
import com.hms.repository.AppointmentRepository;
import com.hms.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;
    
    @Autowired
    private PatientRepository patientRepository;

    public Appointment createAppointment(Appointment appointment) {
    	Optional<Patient> patient = patientRepository.findById(appointment.getPatient().getUserId());
    	appointment.setPatient(patient.get());
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Appointment getAppointmentById(String id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    public Appointment updateAppointment(String id, Appointment updatedAppointment) {
    	Appointment existingAppt = appointmentRepository.findById(id).get();
    	if(updatedAppointment.getStatus()!=null)
        	existingAppt.setStatus(updatedAppointment.getStatus());
    	if(updatedAppointment.getPrimaryPhysician()!=null)
    	existingAppt.setPrimaryPhysician(updatedAppointment.getPrimaryPhysician());
    	if(updatedAppointment.getSchedule()!=null)
    	existingAppt.setSchedule(updatedAppointment.getSchedule());
    	if(updatedAppointment.getCancellationReason()!=null)
    		existingAppt.setCancellationReason(updatedAppointment.getCancellationReason());
    	return appointmentRepository.save(existingAppt);
    }
}
