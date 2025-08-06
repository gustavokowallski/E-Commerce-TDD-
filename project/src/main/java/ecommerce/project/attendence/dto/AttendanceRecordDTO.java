package ecommerce.project.attendence.dto;

import ecommerce.project.attendence.enums.RecordType;

import java.time.LocalDate;
import java.time.LocalTime;

public class AttendanceRecordDTO {
    private Long id;

    private LocalDate date;
    private LocalTime time;

    private RecordType type;

    private Long employeeId;

    public AttendanceRecordDTO(){

    }

    public AttendanceRecordDTO(Long id, Long employeeId, RecordType type, LocalTime time, LocalDate date) {
        this.id = id;
        this.employeeId = employeeId;
        this.type = type;
        this.time = time;
        this.date = date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setType(RecordType type) {
        this.type = type;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
}
