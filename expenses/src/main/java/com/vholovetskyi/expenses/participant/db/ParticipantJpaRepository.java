package com.vholovetskyi.expenses.participant.db;

import com.vholovetskyi.expenses.participant.domain.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantJpaRepository extends JpaRepository<Participant, Long> {
}
