package com.hms.controller;


import com.hms.model.Patient;
import com.hms.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/patients")
@CrossOrigin(origins = "http://localhost:3000")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/register")
    public ResponseEntity<Patient> registerPatient(@RequestBody Patient patient) {
    	Patient pt = patientService.registerPatient(patient);
        return ResponseEntity.status(HttpStatus.CREATED).body(pt);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Optional<Patient>> getPatient(@PathVariable("userId") String userId) {
        return ResponseEntity.ok(patientService.getPatientByUserId(userId));
    }
    
    @PostMapping("/{userId}/update")
    public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient) {
        return ResponseEntity.ok(patientService.updatePatient(patient));
    }
    
    
    @GetMapping("/exists")
    public ResponseEntity<Boolean> checkEmailExists(@RequestParam(name = "email") String email) {
    	if (email == null || email.isEmpty()) {
            return ResponseEntity.badRequest().body(false);
        }
    	boolean exists = patientService.checkEmailExist(email);
        return ResponseEntity.ok(exists);
    }
    
    @GetMapping("/id")
    public ResponseEntity<String> getUserId(@RequestParam(name = "email") String email) {
    	if (email == null || email.isEmpty()) {
            return ResponseEntity.badRequest().body("");
        }
    	String id = patientService.getUserId(email);
        return ResponseEntity.ok(id);
    }
}
