package com.example.employeepayrollserviceapp.controller;

import com.example.employeepayrollserviceapp.dto.EmployeeDTO;
import com.example.employeepayrollserviceapp.dto.ResponseDTO;
import com.example.employeepayrollserviceapp.model.Employee;
import com.example.employeepayrollserviceapp.service.IEmployeePayrollService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class EmployeePayrollController {
    @Autowired
    IEmployeePayrollService service;

    //UC1
    //(first method is written in Employee class, but now method is written in EmployeeDTO class)

//    @GetMapping("/getMessage")
//    public ResponseEntity<String> getMessage(@RequestParam String name){
//        return new ResponseEntity<String>(service.getMessage(name),HttpStatus.OK);
//    }
//    @PostMapping("/postMessage")
//    public ResponseEntity<String> postMessage(@RequestBody Employee employee){
//        return new ResponseEntity<String>(service.postMessage(employee),HttpStatus.OK);
//    }
//    @PutMapping("/putMessage/{name}")
//    public ResponseEntity<String> putMessage(@PathVariable String name){
//        return new ResponseEntity<String>(service.putMessage(name),HttpStatus.OK);
//    }

    //UC2
    //Ability to display welcome message
    @GetMapping("/employeePayrollService")
    public ResponseEntity<String> getWelcome() {
        return new ResponseEntity<String>(service.getWelcome(), HttpStatus.OK);
    }

    //Ability to save employee details to repository
    @PostMapping("/employeePayrollService/create")
    public ResponseEntity<Employee> saveDataToRepo(@RequestBody EmployeeDTO employee) {
        return new ResponseEntity<Employee>(service.postDataToRepo(employee), HttpStatus.OK);
    }

    //Ability to get all employees' data by findAll() method
    @GetMapping("/employeePayrollService/get")
    public ResponseEntity<List<Employee>> getAllDataFromRepo() {
        return new ResponseEntity<List<Employee>>(service.getAllData(), HttpStatus.OK);
    }

    //Ability to get employee data by id
    @GetMapping("/employeePayrollService/get/{id}")
    public ResponseEntity<Employee> getDataFromRepoById(@PathVariable Integer id) {
        Optional<Employee> employee = service.getDataById(id);
        ResponseDTO dto = new ResponseDTO("Data",employee);
        return new ResponseEntity(dto, HttpStatus.OK);
    }

//    //ability to update employee data for particular id
//    @PutMapping("/employeePayrollService/update/{id}")
//    public ResponseEntity<Employee> updateDataInRepo(@PathVariable Integer id, @RequestBody Employee employee) {
//        return new ResponseEntity<Employee>(service.updateDataById(id, employee), HttpStatus.OK);
//    }

    //UC3
    //Ability to update employee data for particular id
    @PutMapping("/employeePayrollService/update/{id}")
    public ResponseEntity<String> updateDataInRepo(@PathVariable Integer id, @RequestBody EmployeeDTO employeeDTO) {
        Employee employee = service.updateDataById(id, employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updating Employee PayrollData Successfuly:", employee);
        return new ResponseEntity(employeeDTO, HttpStatus.OK);
    }

    //UC4: Introducing the service layer and implement the interface class

    //Ability to delete employee data for particular id
    @DeleteMapping("/employeePayrollService/delete/{id}")
    public ResponseEntity<String> deleteDataInRepo(@PathVariable Integer id) {
        return new ResponseEntity<String>(service.deleteDataById(id), HttpStatus.OK);
    }

}