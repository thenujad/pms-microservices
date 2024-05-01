package com.pms.attendanceservice;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class EmployeeDTO {
    // DTO Class( Data transfer Object Class)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String position;

}

