package ecommerce.project.shift.repository;

import ecommerce.project.shift.domain.Shift;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftRepository extends JpaRepository<Shift, Long> {
}
