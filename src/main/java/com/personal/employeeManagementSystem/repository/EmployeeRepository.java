package com.personal.employeeManagementSystem.repository;

import com.personal.employeeManagementSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
