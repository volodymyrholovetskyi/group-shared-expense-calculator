package com.vholovetskyi.participant.domain;

import com.vholovetskyi.commons.jpa.BaseEntity;
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
