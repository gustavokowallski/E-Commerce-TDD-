package ecommerce.project.attendence.domain;

import ecommerce.project.employee.domain.Employee;

import java.time.LocalDate;

public class AttendenceReport {
    private Employee employee;
    private LocalDate startDate;
    private LocalDate endDate;

    private Integer totalWorkedHours;
    private Integer overtimeHours;
    private Integer lateArrivals;
    private Integer absences;

    public AttendenceReport(){}

    public AttendenceReport(Employee employee, Integer absences, Integer lateArrivals, Integer overtimeHours, Integer totalWorkedHours, LocalDate endDate, LocalDate startDate) {
        this.employee = employee;
        this.absences = absences;
        this.lateArrivals = lateArrivals;
        this.overtimeHours = overtimeHours;
        this.totalWorkedHours = totalWorkedHours;
        this.endDate = endDate;
        this.startDate = startDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getAbsences() {
        return absences;
    }

    public void setAbsences(Integer absences) {
        this.absences = absences;
    }

    public Integer getLateArrivals() {
        return lateArrivals;
    }

    public void setLateArrivals(Integer lateArrivals) {
        this.lateArrivals = lateArrivals;
    }

    public Integer getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(Integer overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public Integer getTotalWorkedHours() {
        return totalWorkedHours;
    }

    public void setTotalWorkedHours(Integer totalWorkedHours) {
        this.totalWorkedHours = totalWorkedHours;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }


}
