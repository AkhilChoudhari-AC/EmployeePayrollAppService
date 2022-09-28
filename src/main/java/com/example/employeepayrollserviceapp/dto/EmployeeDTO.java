package com.example.employeepayrollserviceapp.dto;

import java.time.LocalDate;

public class EmployeeDTO {
    private String firstName;
    private String lastName;
    private String profilePic;
    private String address;
    private Long salary ;
    private LocalDate date;
    private String notes;

    public EmployeeDTO() {

    }

    public EmployeeDTO(String firstName, String lastName, String profilePic, String address, Long salary,
                       LocalDate date, String notes) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.profilePic = profilePic;
        this.address = address;
        this.salary = salary;
        this.date = date;
        this.notes = notes;
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

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String department) {
        this.address = department;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}