package com.pms.attendanceservice;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class EmployeeDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String position;

}

