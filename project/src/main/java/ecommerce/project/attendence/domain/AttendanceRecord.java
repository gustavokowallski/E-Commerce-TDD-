package ecommerce.project.attendence.domain;

import ecommerce.project.attendence.enums.RecordType;
import ecommerce.project.attendence.util.AttendanceState;
import ecommerce.project.employee.domain.Employee;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "tb_attendance_records")
public class AttendanceRecord {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private LocalDate date;
        private LocalTime time;

        @Column(nullable = false)
        private AttendanceState attendanceState;

        @ManyToOne
        @JoinColumn(name = "employee_id")
        private Employee employee;

    public  AttendanceRecord() {
    }

    public AttendanceRecord(Long id,LocalTime time, LocalDate date, Employee employee) {
        this.id = id;
        this.time = time;
        this.date = date;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AttendanceState getAttendanceState() {
        return attendanceState;
    }

    public void setAttendanceState(AttendanceState attendanceState) {
        this.attendanceState = attendanceState;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AttendanceRecord that = (AttendanceRecord) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
