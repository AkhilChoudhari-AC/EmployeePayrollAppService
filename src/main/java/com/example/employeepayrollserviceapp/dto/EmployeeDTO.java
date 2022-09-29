package com.example.employeepayrollserviceapp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;


//It include getter and setter # no need to make getter and setter
@Data
//@Getter
//@Setter


public class EmployeeDTO {
    private String firstName;
    private String lastName;
    private String profilePic;
    private String address;
    private Long salary ;
    private LocalDate date;
    private String notes;


    //creating construction of EmployeeDTO class
    public EmployeeDTO() {

    }
    //creating parameterized construction of EmployeeDTO class
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
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//
//    public String getProfilePic() {
//        return profilePic;
//    }
//
//
//    public String getAddress() {
//        return address;
//    }
//
//
//    public Long getSalary() {
//        return salary;
//    }
//
//
//    public LocalDate getDate() {
//        return date;
//    }
//
//
//    public String getNotes() {
//        return notes;
//    }

}