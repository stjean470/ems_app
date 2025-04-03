package com.personal.employeeManagementSystem.service;

import com.personal.employeeManagementSystem.dto.EmployeeDTO;

import java.io.IOException;
import java.util.List;

public interface EmployeeService {
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO getEmployeeById(Long empId);

    //List<EmployeeDTO> getAllEmployees();
}
