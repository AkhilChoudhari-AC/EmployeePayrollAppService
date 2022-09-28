package com.example.employeepayrollserviceapp.model;

import com.example.employeepayrollserviceapp.dto.EmployeeDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

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

    public Employee(EmployeeDTO dto) {
        this.firstName = dto.getFirstName();
        this.lastName = dto.getLastName();
        this.profilePic = dto.getProfilePic();
        this.address = dto.getAddress();
        this.salary =dto.getSalary();
        this.date =dto.getDate();
        this.notes =dto.getNotes();
    }

    public Employee() {

    }
    public Employee(Integer id, EmployeeDTO employeeDTO) {

        this.id = id;
        this.firstName = employeeDTO.getFirstName();
        this.lastName = employeeDTO.getLastName();
        this.profilePic = employeeDTO.getProfilePic();
        this.address = employeeDTO.getAddress();
        this.salary =employeeDTO.getSalary();
        this.date =employeeDTO.getDate();
        this.notes =employeeDTO.getNotes();
    }
    public Employee(Employee employee) {

        this.id = employee.id;
        this.firstName = employee.firstName;
        this.lastName = employee.lastName;
        this.profilePic = employee.profilePic;
        this.address = employee.address;
        this.salary = employee.salary;
        this.date = employee.date;
        this.notes = employee.notes;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
    public void setAddress(String address) {
        this.address = address;
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