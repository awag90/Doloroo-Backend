package com.doloroo.doloroo_backend.user;

import java.time.LocalDate;

public class User {
    private String firstName;
    private String lastName;
    private String diagnosis;
    private LocalDate dob;
    private String emailAddress;


    public User(String firstName, String lastName, String diagnosis, LocalDate dob, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.diagnosis = diagnosis;
        this.dob = dob;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
