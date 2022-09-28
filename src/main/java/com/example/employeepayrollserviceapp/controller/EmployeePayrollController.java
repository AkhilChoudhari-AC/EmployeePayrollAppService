package com.example.employeepayrollserviceapp.controller;

import com.example.employeepayrollserviceapp.dto.EmployeeDTO;
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
    @GetMapping("/getMessage")
    public ResponseEntity<String> getMessage(@RequestParam String name){
        return new ResponseEntity<String>(service.getMessage(name),HttpStatus.OK);
    }
    @PostMapping("/postMessage")
    public ResponseEntity<String> postMessage(@RequestBody Employee employee){
        return new ResponseEntity<String>(service.postMessage(employee),HttpStatus.OK);
    }
    @PutMapping("/putMessage/{name}")
    public ResponseEntity<String> putMessage(@PathVariable String name){
        return new ResponseEntity<String>(service.putMessage(name),HttpStatus.OK);
    }

    //UC2
    //ability to display welcome message
    @GetMapping("/employeepayrollservice")
    public ResponseEntity<String> getWelcome(){
        return new ResponseEntity<String>(service.getWelcome(),HttpStatus.OK);
    }
    //ability to save employee data to repo
    @PostMapping("/employeepayrollservice/create")
    public ResponseEntity<Employee> saveDataToRepo(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(service.postDataToRepo(employee),HttpStatus.OK);
    }
    //ability to get all employees' data by findAll() method
    @GetMapping("/employeepayrollservice/get")
    public ResponseEntity<List<Employee>> getAllDataFromRepo(){
        return new ResponseEntity<List<Employee>>(service.getAllData(),HttpStatus.OK);
    }
    //ability to get employee data by id
    @GetMapping("/employeepayrollservice/get/{id}")
    public ResponseEntity<Employee> getDataFromRepoById(@PathVariable Integer id){
        return new ResponseEntity<Employee>(service.getDataById(id),HttpStatus.OK);
    }
//    //ability to update employee data for particular id
//    @PutMapping("/employeePayrollService/update/{id}")
//    public ResponseEntity<Employee> updateDataInRepo(@PathVariable Integer id, @RequestBody Employee employee) {
//        return new ResponseEntity<Employee>(service.updateDataById(id, employee), HttpStatus.OK);
//    }

    //UC3
    @PutMapping("/employeepayrollservice/update/{id}")
    public ResponseEntity<Employee> updateDataInRepo(@PathVariable Integer id,@RequestBody EmployeeDTO employeeDTO){
        return new ResponseEntity<Employee>(service.updateDataById(id,employeeDTO),HttpStatus.OK);
    }

    //UC4: Introducing the service layer and implement the interface class

    //ability to delete employee data for particular id
    @DeleteMapping("/employeepayrollservice/delete/{id}")
    public ResponseEntity<String> deleteDataInRepo(@PathVariable Integer id){
        return new ResponseEntity<String>(service.deleteDataById(id),HttpStatus.OK);
    }

}