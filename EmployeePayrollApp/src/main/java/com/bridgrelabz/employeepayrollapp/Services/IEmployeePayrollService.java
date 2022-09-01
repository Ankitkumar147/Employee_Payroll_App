package com.bridgrelabz.employeepayrollapp.Services;

import com.bridgrelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import com.bridgrelabz.employeepayrollapp.Model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);
    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);
    EmployeePayrollData updateEmployeePayrollData(int empId , EmployeePayrollDTO empPayrollDTO);
    void deleteEmployeePayrollData(int empId);
}
