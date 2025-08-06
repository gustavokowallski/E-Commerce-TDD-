package ecommerce.project.attendence.service;

import ecommerce.project.attendence.dto.AttendanceRecordDTO;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class AttendanceRecordService {
    @Transactional
    public AttendanceRecordDTO attendanceRecordClockIn(Long employeeId){
        return new AttendanceRecordDTO();
    }
}
