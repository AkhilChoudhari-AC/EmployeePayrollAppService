package com.example.employeepayrollserviceapp.repository;


import com.example.employeepayrollserviceapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeePayrollRepository extends JpaRepository<Employee, Integer> {


     // Query to find data by department
    //            table name as in SQL,  column name as in SQL, variable name as in model class
        @Query(value="select * from employee where department= :department",nativeQuery=true)

        List<Employee> findByDepartment(String department);
        // Query to find data by firstname
        @Query(value="select * from employee where first_name= :firstName",nativeQuery = true)
        List<Employee> findByFirstName(String firstName);




}