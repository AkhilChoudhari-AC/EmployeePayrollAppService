package com.example.employeepayrollserviceapp.service;

import com.example.employeepayrollserviceapp.dto.EmployeeDTO;
import com.example.employeepayrollserviceapp.model.Employee;
import com.example.employeepayrollserviceapp.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeePayrollService implements IEmployeePayrollService {
   //dependence injection, it is a class level injection
    @Autowired
    EmployeePayrollRepository repository;

    public String getMessage(String name) {
        return "Welcome "+name;
    }
    public String postMessage(EmployeeDTO employee) {
        return "Hello "+employee.getFirstName()+""+employee.getLastName()+"!";
    }
    public String putMessage(String name) {
        return "How are you, "+name;
    }
    public String getWelcome() {
        return "Welcome to Employee Payroll !!!";
    }
    public Employee postDataToRepo(EmployeeDTO employee) {
        Employee newEmployee = new Employee(employee);
        repository.save(newEmployee);
        return newEmployee;
    }
    public List<Employee> getAllData(){
        List<Employee> list=repository.findAll();
        return list;
    }
    public Optional<Employee> getDataById(Integer id) {
        Optional<Employee> newEmployee = repository.findById(id);
        return newEmployee;
    }

    public Employee updateDataById(Integer id, EmployeeDTO employeeDTO) {
        Employee newEmployee = new Employee(id,employeeDTO);
        repository.save(newEmployee);
        return newEmployee;
    }
    public String deleteDataById(Integer id) {
        repository.deleteById(id);
        return "Employee with ID:"+id+" got deleted";
    }
}