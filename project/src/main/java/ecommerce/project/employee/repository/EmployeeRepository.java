package ecommerce.project.employee.repository;

import ecommerce.project.employee.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
