package com.vholovetskyi.expenses.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PayerId {

    @Column(name = "payer_id")
    private Long id;

    protected PayerId() {
    }

    private PayerId(Long id) {
        this.id = id;
    }

    public static PayerId create(Long id) {
        if (id <= 0) {
            throw new IllegalArgumentException("");
        }
        return new PayerId(id);
    }
}
