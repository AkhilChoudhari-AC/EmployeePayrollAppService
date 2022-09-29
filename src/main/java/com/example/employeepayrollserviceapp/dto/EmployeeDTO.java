package com.example.employeepayrollserviceapp.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


//It include getter and setter # no need to make getter and setter
@Getter
@Setter
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

}