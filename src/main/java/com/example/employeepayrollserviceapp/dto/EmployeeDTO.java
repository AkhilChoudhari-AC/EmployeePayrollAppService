package com.example.employeepayrollserviceapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.Date;


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

  //  @PastOrPresent(message = "PastOrPresent")
   //@JsonFormat(pattern = "DD-MM-YYYY")
   // @NotEmpty(message="Please enter the date")
    private LocalDate date;
    @NotEmpty(message="Please enter the notes")
    private String notes;
    @NotEmpty(message="Please select the gender (M , F)")
    private String gender;
    @NotEmpty(message="Please select the department (ME, CE, IT)")
    private String department;


    //creating construction of EmployeeDTO class
    public EmployeeDTO() {

    }
    //creating parameterized construction of EmployeeDTO class
    public EmployeeDTO(String firstName, String lastName, String profilePic, String address, Long salary,
                       LocalDate date, String notes, String gender, String department) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.profilePic = profilePic;
        this.address = address;
        this.salary = salary;
        this.date = date;
        this.notes = notes;
        this.gender = gender;
        this.department = department;
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