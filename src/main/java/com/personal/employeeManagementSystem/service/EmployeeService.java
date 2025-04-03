package com.personal.employeeManagementSystem.service;

import com.personal.employeeManagementSystem.dto.EmployeeDTO;

import java.io.IOException;

public interface EmployeeService {
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);
}
