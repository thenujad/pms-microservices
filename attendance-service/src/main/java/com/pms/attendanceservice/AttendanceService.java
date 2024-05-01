package com.pms.attendanceservice;

import com.pms.attendanceservice.client.EmployeeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Autowired
    private EmployeeClient employeeClient;

    public Attendance checkIn(String id) {

        EmployeeDTO employee = employeeClient.getEmployeeOfTheAttendance(id);
        Attendance attendance = new Attendance();
        // Set employee and check-in time
        attendance.setEmployee(employee);
        attendance.setCheckInTime(LocalDateTime.now());

        return attendanceRepository.save(attendance);
    }

    public Attendance checkOut(String attendanceId) {
        Attendance attendance = attendanceRepository.findById(attendanceId)
                .orElseThrow(() -> new RuntimeException("Attendance record not found"));
        attendance.setCheckOutTime(LocalDateTime.now());
        return attendanceRepository.save(attendance);
    }

    public List<Attendance> getAllAttendanceRecords() {
        return attendanceRepository.findAll();
    }
}
