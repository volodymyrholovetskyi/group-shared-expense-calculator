package com.vholovetskyi.expenses.domain;

import java.util.Arrays;

public enum SplitType {
    EQUAL, UNEQUAL, PERCENT;

    public static SplitType parseString(String value) {
       return Arrays.stream(values())
                .filter(v -> v.name().equalsIgnoreCase(value))
                .findFirst().orElseThrow();
    }
}
