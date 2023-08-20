package com.vholovetskyi.commons.exceptions;

public enum ExceptionError {
    INCORRECT_AMOUNT("Incorrect amount entered"),
    INCORRECT_PERCENT("Incorrect percentage entered");

    String message;

    ExceptionError(String message) {
    this.message = message;
    }
}
