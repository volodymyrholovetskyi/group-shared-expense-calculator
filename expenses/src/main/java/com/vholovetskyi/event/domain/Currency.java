package com.vholovetskyi.event.domain;


import java.util.Arrays;

public enum Currency {
    USD("usd"), EUR("eur"), UAH("uah"), PLN("pln");

    private final String code;

    Currency(String code) {
        this.code = code;
    }

    public static Currency of(String currencyCode) {
        return Arrays.stream(values())
                .filter(c -> c.code.equalsIgnoreCase(currencyCode))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown currency: " + currencyCode));
    }
}
