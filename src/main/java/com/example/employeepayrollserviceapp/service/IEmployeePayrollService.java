package com.example.employeepayrollserviceapp.service;

import com.example.employeepayrollserviceapp.dto.EmployeeDTO;
import com.example.employeepayrollserviceapp.model.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeePayrollService {
    public String getMessage(String name) ;
    public String postMessage(Employee employee);
    public String putMessage(String name) ;
    public String getWelcome();
    public Employee postDataToRepo(Employee employee);
   //list is used to save our data
    public List<Employee> getAllData();
    public Employee getDataById(Integer id);
    public Employee updateDataById(Integer id, EmployeeDTO employeeDTO);
    public String deleteDataById(Integer id);
}