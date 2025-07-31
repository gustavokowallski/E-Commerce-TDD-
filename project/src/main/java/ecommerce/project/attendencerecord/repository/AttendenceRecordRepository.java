package ecommerce.project.attendencerecord.repository;

import ecommerce.project.attendencerecord.domain.AttendenceRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendenceRecordRepository extends JpaRepository<AttendenceRecord, Long> {
}
