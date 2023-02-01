package com.bridgrelabz.employeepayrollapp.Services;

import com.bridgrelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import com.bridgrelabz.employeepayrollapp.Model.EmployeePayrollData;
import com.bridgrelabz.employeepayrollapp.Repository.EmployeePayrollRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService{

    @Autowired
    private EmployeePayrollRepository employeePayrollRepository;


//    private List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollRepository.findAll();
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
       return employeePayrollRepository
               .findById(empId);
    }

    @Override
    public List<EmployeePayrollData> getEmployeesByDepartment(String department) {
        return employeePayrollRepository.findEmployeesByDepartment(department);
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
    EmployeePayrollData empData = null;
    empData = new EmployeePayrollData(empPayrollDTO);
    log.debug("Emp Data : "+empData.toString());
    return employeePayrollRepository.save(empData);
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
    EmployeePayrollData empData = this.getEmployeePayrollDataById(empId);
    empData.updateEmployeePayrollData(empPayrollDTO);
    return employeePayrollRepository.save(empData);
    }

    public void deleteEmployeePayrollData(int empId) {
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empId);
        employeePayrollRepository.delete(employeePayrollData);
    }
}
