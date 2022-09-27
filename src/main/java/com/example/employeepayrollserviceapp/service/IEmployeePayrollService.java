package com.example.employeepayrollserviceapp.service;

import com.example.employeepayrollserviceapp.model.Employee;

public interface IEmployeePayrollService {

    public String getMessage(String name) ;
    public String postMessage(Employee employee);
    public String putMessage(String name) ;
}
