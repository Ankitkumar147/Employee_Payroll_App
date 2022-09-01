package com.bridgrelabz.employeepayrollapp.Services;

import com.bridgrelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import com.bridgrelabz.employeepayrollapp.Model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{

    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData> empDataList = new ArrayList<>();
        empDataList.add(new EmployeePayrollData(1,new EmployeePayrollDTO("Ankit",30000)));
        return empDataList;
    }

    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
       EmployeePayrollData empData = null;
       empData = new EmployeePayrollData(1,new EmployeePayrollDTO("Ankit",31000));
       return empData;
    }

    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
    EmployeePayrollData empData = null;
    empData = new EmployeePayrollData(1,empPayrollDTO);
        return empData;
    }

    public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
    EmployeePayrollData empData = null;
    empData = new EmployeePayrollData(1,empPayrollDTO);
        return empData;
    }

    public void deleteEmployeePayrollData(int empId) {

    }
}
