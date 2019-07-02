package com.company.atm;

import com.company.atm.exceptions.DuplicateCardExceptions;
import com.company.atm.exceptions.DuplicateUserExceptions;
import com.company.atm.exceptions.NoMoneyExceptions;
import com.company.atm.exceptions.NotFoundCardExceptions;

public interface Terminal {
    int getCash() throws NotFoundCardExceptions;

    int transaction(int transaction) throws NoMoneyExceptions;

    boolean clientInsert(Client client) throws DuplicateUserExceptions;

    boolean cardInsert(Card card) throws DuplicateCardExceptions;

    boolean deleteCard();

    boolean deleteClient();

    void createcard();
}
