package com.hms.controller;


import com.hms.model.Appointment;
import com.hms.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin(origins = "http://localhost:3000")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentService.createAppointment(appointment);
    }

    @GetMapping
    public List<Appointment> getAppointments() {
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/{appointmentId}")
    public Appointment getAppointment(@PathVariable("appointmentId") String appointmentId) {
    	System.out.print(appointmentId);
        return appointmentService.getAppointmentById(appointmentId);
    }

    @PostMapping("/{appointmentId}")
    public ResponseEntity<Appointment> updateAppointment(@PathVariable("appointmentId") String appointmentId, @RequestBody Appointment appointment) {
    	return ResponseEntity.ok(appointmentService.updateAppointment(appointmentId,appointment));
    }
}
