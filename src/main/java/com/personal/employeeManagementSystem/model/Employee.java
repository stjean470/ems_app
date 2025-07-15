package com.personal.employeeManagementSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    @NotBlank(message = "Please provide a First Name")
    private String firstName;

    @Column(name = "last_name")
    @NotBlank(message = "Please provide a Last Name")
    private String lastName;

    @Column(name = "email")
    @NotBlank(message = "Please provide an email")
    @Email(message = "Must be an email format")
    private String email;
}
