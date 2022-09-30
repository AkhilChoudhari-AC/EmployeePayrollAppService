package com.example.employeepayrollserviceapp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;


//It include getter and setter # no need to make getter and setter
@Data
//@Getter
//@Setter


public class EmployeeDTO {

    //Using regex patter for validation
    @Pattern(regexp="^[a-zA-Z]{3,10}$",message="Please Enter correct first name")
    private String firstName;

    @Pattern(regexp="^[a-zA-Z]{2,15}$",message="Please Enter correct last name")
    private String lastName;
    @NotEmpty(message="Please Enter profilePic")
    private String profilePic;
    @NotEmpty(message="Please enter the address")
    private String address;
    @Min(value=1000,message="Salary should be more than 1000")
    @Max(value=100000,message="Salary should be more than 100000")
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