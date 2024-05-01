package com.pms.attendanceservice.client;

import com.pms.attendanceservice.EmployeeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "employee-service", url = "http://localhost:8072/api/pms/employee")
public interface EmployeeClient {

    @GetMapping("/{id}")
    EmployeeDTO getEmployeeOfTheAttendance(@PathVariable("id") String id);

}
