package com.company;

import com.company.atm.TerminalImpl;
import com.company.atm.exceptions.DuplicateCardExceptions;
import com.company.atm.exceptions.DuplicateUserExceptions;


public class Main {
    public static void main(String[] args) throws DuplicateUserExceptions, DuplicateCardExceptions {


        TerminalImpl terminal = new TerminalImpl();
        terminal.clientInsert(client);
        terminal.cardInsert(card);
        terminal.checkPinCard()

    }
}
