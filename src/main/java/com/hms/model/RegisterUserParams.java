package com.hms.model;

import com.hms.constants.Gender;

import java.util.Date;

public class RegisterUserParams extends CreateUserParams {
    private String userId;
    private Date birthDate;
    private Gender gender;
    private String address;
    private String occupation;
    private String emergencyContactName;
    private String emergencyContactNumber;
    private String primaryPhysician;
    private String insuranceProvider;
    private String insurancePolicyNumber;
    private String allergies;
    private String currentMedication;
    private String familyMedicalHistory;
    private String pastMedicalHistory;
    private String identificationType;
    private String identificationNumber;
    private String identificationDocumentUrl;
    private boolean privacyConsent;

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    public String getPrimaryPhysician() {
        return primaryPhysician;
    }

    public void setPrimaryPhysician(String primaryPhysician) {
        this.primaryPhysician = primaryPhysician;
    }

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setInsuranceProvider(String insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getCurrentMedication() {
        return currentMedication;
    }

    public void setCurrentMedication(String currentMedication) {
        this.currentMedication = currentMedication;
    }

    public String getFamilyMedicalHistory() {
        return familyMedicalHistory;
    }

    public void setFamilyMedicalHistory(String familyMedicalHistory) {
        this.familyMedicalHistory = familyMedicalHistory;
    }

    public String getPastMedicalHistory() {
        return pastMedicalHistory;
    }

    public void setPastMedicalHistory(String pastMedicalHistory) {
        this.pastMedicalHistory = pastMedicalHistory;
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationDocumentUrl() {
        return identificationDocumentUrl;
    }

    public void setIdentificationDocumentUrl(String identificationDocumentUrl) {
        this.identificationDocumentUrl = identificationDocumentUrl;
    }

    public boolean isPrivacyConsent() {
        return privacyConsent;
    }

    public void setPrivacyConsent(boolean privacyConsent) {
        this.privacyConsent = privacyConsent;
    }
}
