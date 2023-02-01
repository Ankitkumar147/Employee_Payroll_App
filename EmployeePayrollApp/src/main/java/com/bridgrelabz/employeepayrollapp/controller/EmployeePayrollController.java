package com.bridgrelabz.employeepayrollapp.controller;

import com.bridgrelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import com.bridgrelabz.employeepayrollapp.DTO.ResponseDTO;
import com.bridgrelabz.employeepayrollapp.Model.EmployeePayrollData;
import com.bridgrelabz.employeepayrollapp.Services.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
@CrossOrigin
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService employeePayrollService;
    @RequestMapping(value ={"","/","/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
        List<EmployeePayrollData> empDataList  = null;
        empDataList = employeePayrollService.getEmployeePayrollData();
        ResponseDTO respDTO = new ResponseDTO("Get call Successful",empDataList);
        return new ResponseEntity<ResponseDTO>(respDTO , HttpStatus.OK);
    }

    @GetMapping("/department/{department}")
        public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("department") String department){
            List<EmployeePayrollData> empDataList = null;
            empDataList = employeePayrollService.getEmployeesByDepartment(department);
            ResponseDTO respDTO = new ResponseDTO("Get Call For the Given Id is Successful", empDataList);
            return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
        }


    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId")int empId) {
        EmployeePayrollData empData = null;
        empData = employeePayrollService.getEmployeePayrollDataById(empId);
        ResponseDTO respDTO = new ResponseDTO("Get call Successfully for empId "+empId, empData);
        return new ResponseEntity<ResponseDTO>(respDTO , HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO){
        EmployeePayrollData empData = null;
        empData = employeePayrollService.createEmployeePayrollData(empPayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Created Employee Payroll Data Successfully",empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
    @PutMapping("/update/{empId}")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("empId")int empId, @RequestBody EmployeePayrollDTO empPayrollDTO){
        EmployeePayrollData empData = null;
        empData = employeePayrollService.updateEmployeePayrollData(empId,empPayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated Employee Payroll Data Successfully",empData);
        return new ResponseEntity<ResponseDTO>(respDTO , HttpStatus.OK);
    }
    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId")int empId){
        employeePayrollService.deleteEmployeePayrollData(empId);
        ResponseDTO respDTO = new ResponseDTO("Deleted Employee from the Payroll Data : ","Deleted Id"+empId);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}
