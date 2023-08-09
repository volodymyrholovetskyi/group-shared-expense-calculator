package com.vholovetskyi.commons.exceptions;

public enum ExceptionError {
    MONEY_ZERO_OR_NEGATIVE("A zero or negative value has been entered");

    String message;

    ExceptionError(String message) {
    this.message = message;
    }
}
