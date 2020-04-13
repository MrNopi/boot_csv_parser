package com.jupiter.boot.repository;

import com.jupiter.boot.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {
}
