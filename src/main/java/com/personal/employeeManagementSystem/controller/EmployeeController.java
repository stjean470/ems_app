package com.personal.employeeManagementSystem.controller;

import com.personal.employeeManagementSystem.dto.EmployeeDTO;
import com.personal.employeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add-employee")
    public ResponseEntity<EmployeeDTO> addEmployeeHandler(@RequestBody EmployeeDTO employeeDTO) {
        EmployeeDTO savedEmployee = employeeService.createEmployee(employeeDTO);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/{empId}")
    public ResponseEntity<EmployeeDTO> getEmployeeHandler(@PathVariable Long empId) {
        return ResponseEntity.ok(employeeService.getEmployeeById(empId));
    }
}
