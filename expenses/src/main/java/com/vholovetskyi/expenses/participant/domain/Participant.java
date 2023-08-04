package com.vholovetskyi.expenses.participant.domain;

import com.vholovetskyi.expenses.commons.jpa.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Participant extends BaseEntity {
    private String name;
    private String email;

}
