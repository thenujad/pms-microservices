package com.pms.payrollservice;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "payroll")
public class Payroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String payrollId;

    @OneToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private EmployeeDTO employee;

    @Column(nullable = false)
    private Long salary;

}
