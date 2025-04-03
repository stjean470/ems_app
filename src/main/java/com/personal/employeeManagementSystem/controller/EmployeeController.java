package com.personal.employeeManagementSystem.controller;

import com.personal.employeeManagementSystem.dto.EmployeeDTO;
import com.personal.employeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @PutMapping("/update/{empId}")
    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Long empId, @RequestBody EmployeeDTO updateEmployee) {
        return ResponseEntity.ok(employeeService.updateEmployee(empId, updateEmployee));
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long empId) {
        return ResponseEntity.ok(employeeService.deleteEmployeeById(empId));
    }
}
