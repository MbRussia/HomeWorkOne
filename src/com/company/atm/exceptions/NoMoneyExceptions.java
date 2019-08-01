package com.company.atm.exceptions;

public class NoMoneyExceptions extends Exception {
    private String errors = "На карте недостаточно ДС";

    @Override
    public String getLocalizedMessage() {
        return errors;
    }

    @Override
    public String getMessage() {
        return errors;
    }
}
