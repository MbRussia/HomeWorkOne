package com.company.atm.exceptions;

public class BlockedAccountExceptions extends Exception {
    private String error = "Данный клиент заблокирован";

    @Override
    public String getMessage() {
        return error;
    }

    @Override
    public String getLocalizedMessage() {
        return error;
    }
}
