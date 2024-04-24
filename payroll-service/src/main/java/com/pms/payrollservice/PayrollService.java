package com.pms.payrollservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayrollService {

    @Autowired
    private PayrollRepository payrollRepository;

    public List<Payroll> getAllPayrollRecords() {
        return payrollRepository.findAll();
    }

    public Payroll calculatePayroll(String employeeId) {
        // Logic to calculate payroll
        return new Payroll();
    }

    public Payroll getPayrollById(String id) {
        return payrollRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Payroll record not found"));
    }
}
