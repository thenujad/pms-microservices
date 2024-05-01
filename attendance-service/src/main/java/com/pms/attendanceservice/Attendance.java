package com.pms.attendanceservice;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String attendanceId;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private EmployeeDTO employee;

    @Column(nullable = false)
    private LocalDateTime checkInTime;

    @Column(nullable = true)
    private LocalDateTime checkOutTime;

}
