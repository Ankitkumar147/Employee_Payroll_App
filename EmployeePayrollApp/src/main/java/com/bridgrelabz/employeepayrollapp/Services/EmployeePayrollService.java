package com.bridgrelabz.employeepayrollapp.Services;

import com.bridgrelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import com.bridgrelabz.employeepayrollapp.Model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{

    private List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();

    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollDataList;
    }

    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
       return employeePayrollDataList.get(empId);
    }

    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
    EmployeePayrollData empData = null;
    empData = new EmployeePayrollData(employeePayrollDataList.size()+1, empPayrollDTO);
    employeePayrollDataList.add(empData);
        return empData;
    }

    public EmployeePayrollData updateEmployeePayrollData(int empId , EmployeePayrollDTO empPayrollDTO) {
    EmployeePayrollData empData = this.getEmployeePayrollDataById(empId);
    empData.setName(empPayrollDTO.Name);
    empData.setSalary(empPayrollDTO.Salary);
    employeePayrollDataList.set(empId,empData);
    return empData;
    }

    public void deleteEmployeePayrollData(int empId) {
    employeePayrollDataList.remove(empId);
    }
}
