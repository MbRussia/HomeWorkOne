package com.company.atm;

import com.company.atm.exceptions.DuplicateCardExceptions;
import com.company.atm.exceptions.DuplicateUserExceptions;
import com.company.atm.exceptions.NotFoundCardExceptions;

public interface Terminal {
    int getCash(int numberCard) throws NotFoundCardExceptions;

    void transaction(int transaction, int numberCard);

    void clientInsert(Client client) throws DuplicateUserExceptions;

    void cardInsert(Card card) throws DuplicateCardExceptions;

}
