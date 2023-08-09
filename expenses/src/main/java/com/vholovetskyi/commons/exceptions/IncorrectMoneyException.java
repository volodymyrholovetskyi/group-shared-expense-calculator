package com.vholovetskyi.commons.exceptions;

public class IncorrectMoneyException extends RuntimeException {

   private ExceptionError exceptionError;

    public IncorrectMoneyException(ExceptionError exceptionError) {
        this.exceptionError = exceptionError;
    }
}
