package com.military.repo;

import com.military.model.LogEntry;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LogRepository extends JpaRepository<LogEntry, Long> {}
