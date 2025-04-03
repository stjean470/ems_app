package com.personal.employeeManagementSystem.mapper;

import com.personal.employeeManagementSystem.dto.EmployeeDTO;
import com.personal.employeeManagementSystem.model.Employee;

public class EmployeeMapper {
    public static EmployeeDTO mapToEmployeeDto(Employee employee) {
        return new EmployeeDTO(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDTO employeeDTO) {
        return new Employee(
                employeeDTO.getId(),
                employeeDTO.getFirstName(),
                employeeDTO.getLastName(),
                employeeDTO.getEmail()
        );
    }
}
