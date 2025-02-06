package com.hms.service;

import com.hms.model.Patient;
import com.hms.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient registerPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Optional<Patient> getPatientByUserId(String userId) {
        return patientRepository.findByUserId(userId);
    }
    
    public Patient updatePatient(Patient patient) {
    	return patientRepository.save(patient);
    }
    
    public boolean checkEmailExist(String email) {
    	return patientRepository.existByEmail(email);
    }
    
    public String getUserId(String email){
    	return patientRepository.findUserIdByEmail(email);
    }
}
