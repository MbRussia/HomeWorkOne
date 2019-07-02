package com.company;

import com.company.atm.Transaction;
import com.company.atm.exceptions.DuplicateUserExceptions;


public class Main {
    public static void main(String[] args) throws DuplicateUserExceptions {
        Transaction trmn = new Transaction();
        trmn.workTerminal();
    }
}
