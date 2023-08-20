package com.vholovetskyi.expenses.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PayerID {
    @Column(name = "payer_id")
    private Long id;

    protected PayerID() {
    }
    private PayerID(Long id) {
        this.id = id;
    }

    public static PayerID create(Long id) {
        if (id <= 0) {
            throw new IllegalArgumentException("");
        }
        return new PayerID(id);
    }
}
