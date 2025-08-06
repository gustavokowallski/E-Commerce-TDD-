package ecommerce.project.services;

import ecommerce.project.attendence.dto.AttendanceRecordDTO;
import ecommerce.project.attendence.service.AttendanceRecordService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class AttendanceRecordTest {

    @InjectMocks
    private AttendanceRecordService attendanceRecordService;

    private Long existingId;

    @BeforeEach
    void setUp(){
        existingId = 1L;

    }

    @Test
    void AttendanceRecordClockInShouldReturnEmployeeClockedInWhenSucess(){
        AttendanceRecordDTO result = attendanceRecordService.attendanceRecordClockIn(existingId);

        Assertions.assertNotNull(result);
    }
}
