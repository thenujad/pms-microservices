package com.pms.employeeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(String id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public Employee updateEmployee(String id, Employee employee) {
        Employee existingEmployee = getEmployeeById(id);
        // Update the existing employee with new data
        return employeeRepository.save(existingEmployee);
    }

    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }
}
