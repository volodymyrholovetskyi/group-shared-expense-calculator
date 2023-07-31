package com.vholovetskyi.expenses.event.db;

import com.vholovetskyi.expenses.event.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

public interface EventJpaRepository extends JpaRepository<Event, Long> {

    @Override
            @Modifying
    <S extends Event> S save(S entity);
}
