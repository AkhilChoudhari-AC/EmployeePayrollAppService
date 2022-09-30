package com.example.employeepayrollserviceapp.controller;

import com.example.employeepayrollserviceapp.dto.EmployeeDTO;
import com.example.employeepayrollserviceapp.dto.ResponseDTO;
import com.example.employeepayrollserviceapp.model.Employee;
import com.example.employeepayrollserviceapp.service.IEmployeePayrollService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/employeepayrollservice")
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
//    @GetMapping("/employeePayrollService")
//    public ResponseEntity<String> getWelcome() {
//        return new ResponseEntity<String>(service.getWelcome(), HttpStatus.OK);
//    }
//
//    //Ability to save employee details to repository
//    @PostMapping("/employeePayrollService/create")
//    public ResponseEntity<Employee> saveDataToRepo(@RequestBody EmployeeDTO employee) {
//        return new ResponseEntity<Employee>(service.postDataToRepo(employee), HttpStatus.OK);
//    }
//
//    //Ability to get all employees' data by findAll() method
//    @GetMapping("/employeePayrollService/get")
//    public ResponseEntity<List<Employee>> getAllDataFromRepo() {
//        return new ResponseEntity<List<Employee>>(service.getAllData(), HttpStatus.OK);
//    }
//
//    //Ability to get employee data by id
//    @GetMapping("/employeePayrollService/get/{id}")
//    public ResponseEntity<Employee> getDataFromRepoById(@PathVariable Integer id) {
//        Optional<Employee> employee = service.getDataById(id);
//        ResponseDTO dto = new ResponseDTO("Data",employee);
//        return new ResponseEntity(dto, HttpStatus.OK);
//    }
//
////    //ability to update employee data for particular id
////    @PutMapping("/employeePayrollService/update/{id}")
////    public ResponseEntity<Employee> updateDataInRepo(@PathVariable Integer id, @RequestBody Employee employee) {
////        return new ResponseEntity<Employee>(service.updateDataById(id, employee), HttpStatus.OK);
////    }
//
//    //UC3
//    //Ability to update employee data for particular id
//    @PutMapping("/employeePayrollService/update/{id}")
//    public ResponseEntity<String> updateDataInRepo(@PathVariable Integer id, @RequestBody EmployeeDTO employeeDTO) {
//        Employee employee = service.updateDataById(id, employeeDTO);
//        ResponseDTO responseDTO = new ResponseDTO("Updating Employee PayrollData Successfuly:", employee);
//        return new ResponseEntity(employeeDTO, HttpStatus.OK);
//    }
//
//    //UC4: Introducing the service layer and implement the interface class
//
//    //Ability to delete employee data for particular id
//    @DeleteMapping("/employeePayrollService/delete/{id}")
//    public ResponseEntity<String> deleteDataInRepo(@PathVariable Integer id) {
//        return new ResponseEntity<String>(service.deleteDataById(id), HttpStatus.OK);
//    }
//
//}
    // UC 5 AND SO ON
    //Ability to display welcome message
    @GetMapping("")
    public ResponseEntity<String> getWelcome(){
        String welcome = service.getWelcome();
        return new ResponseEntity<String>(welcome,HttpStatus.OK);
    }
    //Ability to save employee data to repo
    @PostMapping("/create")
    public ResponseEntity<String> addDataToRepo(@Valid @RequestBody EmployeeDTO employeeDTO){
        Employee newEmployee = service.postDataToRepo(employeeDTO);
        ResponseDTO dto = new ResponseDTO("Record Added Succesfully",newEmployee);
        return new ResponseEntity(dto,HttpStatus.CREATED);
    }
    //Ability to get all employees' data by findAll() method
    @GetMapping("/get")
    public ResponseEntity<String>getAllDataFromRepo(){
        List<Employee> listOfEmployee = service.getAllData();
        ResponseDTO dto = new ResponseDTO("Record Retrieved Successfully", listOfEmployee);
        return new ResponseEntity(dto,HttpStatus.OK);
    }
    //Ability to get employee data by id
    @GetMapping("/get/{id}")
    public ResponseEntity<String> getDataFromRepoById(@PathVariable Integer id){
        Optional<Employee> existingEmployee = service.getDataById(id);
        ResponseDTO dto = new ResponseDTO("Record for given ID Retrieved Successfully", existingEmployee);
        return new ResponseEntity(dto,HttpStatus.OK);
    }
    //Ability to update employee data for particular id
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateDataInRepo(@PathVariable Integer id,@Valid @RequestBody EmployeeDTO employeeDTO){
        Employee updatedEmployee = service.updateDataById(id, employeeDTO);
        ResponseDTO dto = new ResponseDTO("Record for particular ID Updated Successfully",updatedEmployee);
        return new ResponseEntity(dto,HttpStatus.ACCEPTED);
    }
    //Ability to delete employee data for particular id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDataInRepo(@PathVariable Integer id){
        ResponseDTO dto = new ResponseDTO("Record for particular ID Deleted Successfully", service.deleteDataById(id));
        return new ResponseEntity(dto,HttpStatus.ACCEPTED);
    }
}
