package ecommerce.project.attendence.repository;

import ecommerce.project.attendence.domain.AttendanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRecordRepository extends JpaRepository<AttendanceRecord, Long>{

}
