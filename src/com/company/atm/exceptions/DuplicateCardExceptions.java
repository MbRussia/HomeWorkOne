package com.company.atm.exceptions;

public class DuplicateCardExceptions extends Exception {
    private String error = "Карта уже существует";

    @Override
    public String getMessage() {
        return error;
    }

    @Override
    public String getLocalizedMessage() {
        return error;
    }
}
