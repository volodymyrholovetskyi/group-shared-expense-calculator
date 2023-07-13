package com.vholovetskyi.expenses.commons;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "uuid")
public class BaseEntity {

    private Long id;
    private String uuid = UUID.randomUUID().toString();
    private long version;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
