package com.example.employeepayrollserviceapp.repository;


import com.example.employeepayrollserviceapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<Employee, Integer> {
}