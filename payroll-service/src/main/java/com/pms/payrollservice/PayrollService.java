package com.pms.payrollservice;

import com.pms.payrollservice.client.EmployeeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayrollService {

    @Autowired
    private PayrollRepository payrollRepository;

    @Autowired
    private EmployeeClient employeeClient;

    public List<Payroll> getAllPayrollRecords() {
        return payrollRepository.findAll();
    }

    public Payroll calculatePayroll(String employeeId) {
        // Logic to calculate payroll
        EmployeeDTO employee = employeeClient.getEmployeeOfThePayroll(employeeId);
        // Implement the logic to calculate payroll based on employee details
        double salary = calculateSallary(employee);  // Example method to calculate salary
        Payroll payroll = new Payroll();
        payroll.setEmployee(employee);
        payroll.setSalary(salary);
        return new Payroll();
    }

    private double calculateSallary(EmployeeDTO employee) {
        return 2000;
    }

    public Payroll getPayrollById(String id) {
        return payrollRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Payroll record not found"));
    }
}
