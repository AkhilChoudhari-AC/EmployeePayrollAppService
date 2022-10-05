package com.example.employeepayrollserviceapp.service;

import com.example.employeepayrollserviceapp.dto.EmployeeDTO;
import com.example.employeepayrollserviceapp.model.Employee;

import java.util.List;

public interface IEmployeePayrollService {

    public String getWelcome();

    public Employee postDataToRepo(EmployeeDTO employeeDTO);

    public List<Employee> getAllData();

    public Employee getDataById(Integer id);

    public Employee updateDataById(Integer id, EmployeeDTO employeeDTO);

    public String deleteDataById(Integer id);
    public List<Employee> getDataByDepartment(String department);
    public List<Employee> getDataByFirstName(String firstName);

}