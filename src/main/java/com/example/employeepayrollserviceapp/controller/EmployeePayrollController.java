package com.example.employeepayrollserviceapp.controller;

import com.example.employeepayrollserviceapp.model.Employee;
import com.example.employeepayrollserviceapp.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeePayrollController {

    @Autowired
    IEmployeePayrollService service;

    //UC1
// getting the data with message stored in service
    @GetMapping("/getMessage")
    public ResponseEntity<String> getMessage(@RequestParam String name){
        return new ResponseEntity<String>(service.getMessage(name), HttpStatus.OK);
    }
    //Creating the data
    @PostMapping("/postMessage")
    public ResponseEntity<String> postMessage(@RequestBody Employee employee){
        return new ResponseEntity<String>(service.postMessage(employee),HttpStatus.OK);
    }
    //updating the existing data
    @PutMapping("/putMessage/{name}")
    public ResponseEntity<String> putMessage(@PathVariable String name){
        return new ResponseEntity<String>(service.putMessage(name), HttpStatus.OK);
    }
}