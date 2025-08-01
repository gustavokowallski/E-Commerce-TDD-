package ecommerce.project.attendence.repository;

import ecommerce.project.attendence.domain.AttendenceRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendenceRecordRepository extends JpaRepository<AttendenceRecord, Long> {
}
