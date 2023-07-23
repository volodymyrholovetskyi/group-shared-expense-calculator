package com.vholovetskyi.expenses.event.db;

import com.vholovetskyi.expenses.event.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventJpaRepository extends JpaRepository<Event, Long> {
}
