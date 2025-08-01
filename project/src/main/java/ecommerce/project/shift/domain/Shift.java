package ecommerce.project.shift.domain;

import ecommerce.project.employee.domain.Employee;
import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "tb_shift")
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private LocalTime startTime;

    @Column(nullable = false)
    private LocalTime endTime;

    @Column(nullable = false)
    private Integer toleranceMinutes;

    @Column(nullable = false)
    private Integer maxBreakDuration;

    @Column(nullable = false)
    private Integer dailyWorkload;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Shift(){
    }

    public Shift(Long id, Integer dailyWorkload, Integer maxBreakDuration, Integer toleranceMinutes, LocalTime endTime, LocalTime startTime, String name) {
        this.id = id;
        this.dailyWorkload = dailyWorkload;
        this.maxBreakDuration = maxBreakDuration;
        this.toleranceMinutes = toleranceMinutes;
        this.endTime = endTime;
        this.startTime = startTime;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public Integer getMaxBreakDuration() {
        return maxBreakDuration;
    }

    public void setMaxBreakDuration(Integer maxBreakDuration) {
        this.maxBreakDuration = maxBreakDuration;
    }

    public Integer getToleranceMinutes() {
        return toleranceMinutes;
    }

    public void setToleranceMinutes(Integer toleranceMinutes) {
        this.toleranceMinutes = toleranceMinutes;
    }

    public Integer getDailyWorkload() {
        return dailyWorkload;
    }

    public void setDailyWorkload(Integer dailyWorkload) {
        this.dailyWorkload = dailyWorkload;
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
        Shift shift = (Shift) o;
        return Objects.equals(id, shift.id) && Objects.equals(name, shift.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
