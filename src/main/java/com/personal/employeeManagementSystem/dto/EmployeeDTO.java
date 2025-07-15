package com.personal.employeeManagementSystem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private Long id;

    @NotBlank(message = "Please provide a First Name")
    private String firstName;

    @NotBlank(message = "Please provide a Last Name")
    private String lastName;

    @NotBlank(message = "Please provide an email")
    @Email(message = "Must be an email format")
    private String email;
}
