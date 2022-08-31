package com.bridgrelabz.employeepayrollapp.Model;

import com.bridgrelabz.employeepayrollapp.DTO.EmployeePayrollDTO;

public class EmployeePayrollData {

    public int employeeID;
    public String Name;
    public  long Salary;

    public EmployeePayrollData(){

    }
    public EmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO){
        this.employeeID = empId;
        this.Name = empPayrollDTO.Name;
        this.Salary = empPayrollDTO.Salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public long getSalary() {
        return Salary;
    }

    public void setSalary(long salary) {
        Salary = salary;
    }
}
