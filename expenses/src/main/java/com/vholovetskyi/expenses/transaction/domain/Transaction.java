package com.vholovetskyi.expenses.transaction.domain;


import com.vholovetskyi.expenses.commons.jpa.BaseEntity;
import com.vholovetskyi.expenses.journey.domain.Journey;
import com.vholovetskyi.expenses.participant.domain.Participant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction extends BaseEntity {
    private String name;
    private String category;
    @Enumerated(value = EnumType.STRING)
    private SplitType split;
    @Column(name = "journey_id")
    private Long journeyId;
    @Embedded
    private Money amount;

//    @OneToOne
//    @JoinColumn(name = "participant_id")
//    private Participant participant;
}
