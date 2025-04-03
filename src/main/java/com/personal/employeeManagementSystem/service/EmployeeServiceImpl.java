package com.personal.employeeManagementSystem.service;

import com.personal.employeeManagementSystem.dto.EmployeeDTO;
import com.personal.employeeManagementSystem.mapper.EmployeeMapper;
import com.personal.employeeManagementSystem.model.Employee;
import com.personal.employeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        //Create Employee by mapping the EmployeeDto to employee
        Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
        //save the employee to the database
        Employee saveEmployee = employeeRepository.save(employee);
        //map that employee back into a new EmployeeDto and return it to the client
        return EmployeeMapper.mapToEmployeeDto(saveEmployee);
    }
}
