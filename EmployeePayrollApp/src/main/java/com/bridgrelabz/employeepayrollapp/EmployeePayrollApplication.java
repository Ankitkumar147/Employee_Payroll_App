package com.bridgrelabz.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Using Lombok Library for Logging -----> Slf4j
 * Created Application.Properties for dev and production.
 *
 */
@SpringBootApplication
@Slf4j
@EnableJpaRepositories
public class EmployeePayrollApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(EmployeePayrollApplication.class, args);
        log.info("Employee Payroll App Started in {} Environment.",context.getEnvironment().getProperty("environment"));
        System.out.println("Welcome to the Employee Payroll Application.");
    }
}
