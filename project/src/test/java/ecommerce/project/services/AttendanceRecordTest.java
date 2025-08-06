package ecommerce.project.services;

import ecommerce.project.attendence.service.AttendanceRecordService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class AttendanceRecordTest {

    @InjectMocks
    private AttendanceRecordService attendanceRecordService;

    @Test
    void AttendanceRecordClockInShouldReturnEmployeeClockedInWhenSucess(){
        attendanceRecordService.attendanceRecordClockIn();
    }
}
