package com.example.employeepayrollserviceapp;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

// used to write and display the message # any message
@Slf4j

public class EmployeePayrollServiceAppApplication {

    public static void main(String[] args) {
        // always write lig.info("....."); , inside the method only, otherwise it will give error
        log.info("Welcome to the Employee Payroll Service App Program ");
        SpringApplication.run(EmployeePayrollServiceAppApplication.class, args);
    }

}
