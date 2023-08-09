package com.vholovetskyi.event.db;

import com.vholovetskyi.event.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EventJpaRepository extends JpaRepository<Event, Long> {

    @Override
    @Modifying
    <S extends Event> S save(S entity);

    @Query("SELECT DISTINCT event FROM Event event")
    List<Event> getFetchEvents();

}
