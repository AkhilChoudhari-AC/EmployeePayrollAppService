package com.example.employeepayrollserviceapp.repository;


import com.example.employeepayrollserviceapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeePayrollRepository extends JpaRepository<Employee, Integer> {


      //  @Query(value="select * from employee ,employee where id = id and department= :department",nativeQuery=true)
        @Query(value="select * from employee where department= :department",nativeQuery=true)
      // @Query(value="select id, first_name, department from employee where department = IT",nativeQuery=true)
        List<Employee> findByDepartment(String department);


}