package com.example.employeepayrollserviceapp.model;

import com.example.employeepayrollserviceapp.dto.EmployeeDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

//It include getter and setter # no need to make getter and setter
@Data
//It is used to create the tables in the database
@Entity
public class Employee {

    //This annotation specifies the primary key of an entity
    @Id

    // To automatically generate the primary key values
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String profilePic;
    private String address;
    private Long salary ;
    private LocalDate date;
    private String notes;
//    public Employee(Integer id, String firstName, String lastName, String profilePic, String address, Long salary,
//                    LocalDate date, String notes) {
//
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.profilePic = profilePic;
//        this.address = address;
//        this.salary = salary;
//        this.date = date;
//        this.notes = notes;
//    }

    public Employee() {

    }

    public Employee(EmployeeDTO employee) {

        this.firstName = employee.getFirstName();
        this.lastName = employee.getLastName();
        this.profilePic = employee.getProfilePic();
        this.address = employee.getAddress();
        this.salary = employee.getSalary();
        this.date = employee.getDate();
        this.notes = employee.getNotes();
    }

    public Employee(Integer id, EmployeeDTO employeeDTO) {
        this.id = id;
        this.firstName = employeeDTO.getFirstName();
        this.lastName = employeeDTO.getLastName();
        this.profilePic = employeeDTO.getProfilePic();
        this.address = employeeDTO.getAddress();
        this.salary = employeeDTO.getSalary();
        this.date = employeeDTO.getDate();
        this.notes = employeeDTO.getNotes();
    }

}