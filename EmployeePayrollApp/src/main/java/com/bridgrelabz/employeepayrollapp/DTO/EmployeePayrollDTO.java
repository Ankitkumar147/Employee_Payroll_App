package com.bridgrelabz.employeepayrollapp.DTO;

import lombok.Data;

@Data
public class EmployeePayrollDTO {

    public String Name;
    public long Salary;

    public EmployeePayrollDTO(String Name, long Salary) {
        this.Name = Name;
        this.Salary = Salary;
    }
    public String toString(){
        return "name = "+Name+", Salary = "+Salary;
    }

}
