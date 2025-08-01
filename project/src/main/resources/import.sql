-- ==========================
-- INSERT SHIFTS
-- ==========================
INSERT INTO tb_shifts (name, start_time, end_time, tolerance_minutes, max_break_duration, daily_workload) VALUES ('Morning', '08:00:00', '16:00:00', 10, 60, 8);
INSERT INTO tb_shifts (name, start_time, end_time, tolerance_minutes, max_break_duration, daily_workload) VALUES ('Afternoon', '16:00:00', '00:00:00', 10, 45, 8);
INSERT INTO tb_shifts (name, start_time, end_time, tolerance_minutes, max_break_duration, daily_workload) VALUES ('Night', '00:00:00', '08:00:00', 15, 30, 7);
-- ==========================
-- EMPLOYEES
-- ==========================
INSERT INTO tb_employees (name, email, password, position, active, shift_id) VALUES ('Alice Johnson', 'alice.johnson@example.com', '$2a$10$.mmz3OqUecF234Bic.FuYO5uZF9eZZGYM7aDkVLpqGVKUqBfhwrAC', 'Developer', TRUE, 1);

INSERT INTO tb_employees (name, email, password, position, active, shift_id) VALUES ('Bob Smith', 'bob.smith@example.com', '$2a$10$.mmz3OqUecF234Bic.FuYO5uZF9eZZGYM7aDkVLpqGVKUqBfhwrAC', 'Designer', TRUE, 2);

INSERT INTO tb_employees (name, email, password, position, active, shift_id) VALUES ('Charlie Brown', 'charlie.brown@example.com', '$2a$10$.mmz3OqUecF234Bic.FuYO5uZF9eZZGYM7aDkVLpqGVKUqBfhwrAC', 'Support', FALSE, 3);

INSERT INTO tb_employees (name, email, password, position, active, shift_id) VALUES ('Diana Prince', 'diana.prince@example.com', '$2a$10$.mmz3OqUecF234Bic.FuYO5uZF9eZZGYM7aDkVLpqGVKUqBfhwrAC', 'Manager', TRUE, 1);

INSERT INTO tb_employees (name, email, password, position, active, shift_id) VALUES ('Ethan Clark', 'ethan.clark@example.com', '$2a$10$.mmz3OqUecF234Bic.FuYO5uZF9eZZGYM7aDkVLpqGVKUqBfhwrAC', 'Intern', TRUE, 2);

-- ==========================
-- ATTENDANCE RECORDS
-- ==========================
-- Alice (on time, with break)
INSERT INTO tb_attendance_records (employee_id, date, time, type) VALUES (1, '2025-07-30', '08:05:00', 'CLOCK_IN');

INSERT INTO tb_attendance_records (employee_id, date, time, type) VALUES (1, '2025-07-30', '12:00:00', 'BREAK_START');

INSERT INTO tb_attendance_records (employee_id, date, time, type) VALUES (1, '2025-07-30', '12:30:00', 'BREAK_END');

INSERT INTO tb_attendance_records (employee_id, date, time, type) VALUES (1, '2025-07-30', '16:05:00', 'CLOCK_OUT');

-- Bob (late)
INSERT INTO tb_attendance_records (employee_id, date, time, type) VALUES (2, '2025-07-30', '16:15:00', 'CLOCK_IN');

INSERT INTO tb_attendance_records (employee_id, date, time, type) VALUES (2, '2025-07-30', '20:00:00', 'BREAK_START');

INSERT INTO tb_attendance_records (employee_id, date, time, type) VALUES (2, '2025-07-30', '20:40:00', 'BREAK_END');

INSERT INTO tb_attendance_records (employee_id, date, time, type) VALUES (2, '2025-07-30', '00:10:00', 'CLOCK_OUT');

-- Ethan (overtime)
INSERT INTO tb_attendance_records (employee_id, date, time, type) VALUES (5, '2025-07-30', '16:00:00', 'CLOCK_IN');

INSERT INTO tb_attendance_records (employee_id, date, time, type) VALUES (5, '2025-07-30', '20:00:00', 'BREAK_START');

INSERT INTO tb_attendance_records (employee_id, date, time, type) VALUES (5, '2025-07-30', '20:20:00', 'BREAK_END');

INSERT INTO tb_attendance_records (employee_id, date, time, type) VALUES (5, '2025-07-30', '01:30:00', 'CLOCK_OUT');