package com.pms.payrollservice.client;

import com.pms.payrollservice.EmployeeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "employee-service", url = "http://localhost:8072/api/pms/employee")
public interface EmployeeClient {

    @GetMapping("/{id}")
    EmployeeDTO getEmployeeOfThePayroll(@PathVariable("id") String id);

}
