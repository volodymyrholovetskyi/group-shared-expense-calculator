package com.vholovetskyi.expenses.participant.domain;

import com.vholovetskyi.expenses.commons.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Participant extends BaseEntity {

    private Long id;

    private String name;

    private String email;

}
