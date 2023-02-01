package com.bridgrelabz.employeepayrollapp.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeePayrollDTO {

    public String name;
    public long salary;
    public String gender;

    @JsonFormat
    //(pattern = "dd MM yyyy")
    @NotNull(message = "Start Date should not be Empty")
    @PastOrPresent(message = "Start Date should be past date or today's date")
    public LocalDate startDate;

    @NotBlank(message = "Note cannot be Empty")
    public String note;

    @NotBlank(message = "Profile Pic cannot be Empty")
    public String profilePic;

    @NotNull(message = "Department should not be Empty")
    public List<String> department;
}
