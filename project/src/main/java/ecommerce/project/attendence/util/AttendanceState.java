package ecommerce.project.attendence.util;

import ecommerce.project.attendence.domain.AttendanceRecord;

import java.time.LocalDateTime;

public interface AttendanceState {
    void checkIn(AttendanceRecord record, LocalDateTime time);
    void startBreak(AttendanceRecord record, LocalDateTime time);
    void endBreak(AttendanceRecord record, LocalDateTime time);
    void checkOut(AttendanceRecord record, LocalDateTime time);
}
