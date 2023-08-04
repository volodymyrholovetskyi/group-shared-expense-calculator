package com.vholovetskyi.expenses.journey.db;

import com.vholovetskyi.expenses.journey.domain.Journey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.Optional;

public interface JourneyJpaRepository extends JpaRepository<Journey, Long> {

    @Override
    @Modifying
    <S extends Journey> S save(S entity);

}
