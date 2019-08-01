package com.company.atm.exceptions;

public class NotFoundCardExceptions extends Exception {
    private String error = "Карта не найдена";

    @Override
    public String getMessage() {
        return error;
    }

    @Override
    public String getLocalizedMessage() {
        return error;
    }
}
