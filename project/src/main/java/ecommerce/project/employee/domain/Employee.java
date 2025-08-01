package ecommerce.project.employee.domain;

import ecommerce.project.attendence.domain.AttendenceRecord;
import ecommerce.project.shift.domain.Shift;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String position;
    private Boolean active;

    @OneToMany(mappedBy = "employee")
    private List<AttendenceRecord> records = new ArrayList<>();

    @OneToOne(mappedBy = "employee")
    private Shift shifts;

    public Employee(){
    }

    public Employee(Long id, Boolean active, String position, String password, String email, String name) {
        this.id = id;
        this.active = active;
        this.position = position;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AttendenceRecord> getRecords() {
        return records;
    }


    public Shift getShifts() {
        return shifts;
    }

    public void setShifts(Shift shifts) {
        this.shifts = shifts;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(email, employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }
}
