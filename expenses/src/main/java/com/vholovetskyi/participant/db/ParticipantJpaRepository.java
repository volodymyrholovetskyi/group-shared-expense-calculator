package com.vholovetskyi.participant.db;

import com.vholovetskyi.participant.domain.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantJpaRepository extends JpaRepository<Participant, Long> {
}
