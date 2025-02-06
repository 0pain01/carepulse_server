package com.hms.repository;

import com.hms.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, String> {
    Optional<Patient> findByUserId(String userId);
    
    @Query("SELECT CASE WHEN COUNT(p) > 0 THEN TRUE ELSE FALSE END FROM Patient p WHERE p.email = :email")
    boolean existByEmail(@Param(value = "email") String email);
    
    @Query("SELECT p.userId FROM Patient p WHERE p.email = :email")
    String findUserIdByEmail(@Param("email") String email);
}
