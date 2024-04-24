package com.pms.payrollservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payroll")
public class PayrollController {

    @Autowired
    private PayrollService payrollService;

    @GetMapping
    public ResponseEntity<List<Payroll>> getAllPayrollRecords() {
        return ResponseEntity.ok(payrollService.getAllPayrollRecords());
    }

    @PostMapping("/calculate")
    public ResponseEntity<Payroll> calculatePayroll(@RequestParam String employeeId) {
        return ResponseEntity.ok(payrollService.calculatePayroll(employeeId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Payroll> getPayrollById(@PathVariable String id) {
        return ResponseEntity.ok(payrollService.getPayrollById(id));
    }
}
