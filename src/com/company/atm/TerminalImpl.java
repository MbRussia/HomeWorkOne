package com.company.atm;

import com.company.atm.exceptions.DuplicateCardExceptions;
import com.company.atm.exceptions.DuplicateUserExceptions;
import com.company.atm.exceptions.NotFoundCardExceptions;

import java.util.ArrayList;

public class TerminalImpl implements Terminal {
    private ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<Card> cards = new ArrayList<>();


    @Override
    public int getCash(int numberCard) throws NotFoundCardExceptions {
        for (Card card : cards) {
            if (numberCard == card.getNumberCard()) {
                return card.getCash();
            }
        }
        throw new NotFoundCardExceptions();
    }

    @Override
    public void transaction(int transaction, int numberCard) {

    }

    @Override
    public void clientInsert(Client client) throws DuplicateUserExceptions {
        for (Client clientInsert : clients) {
            if (clientInsert.getName().equals(client.getName())) {
                throw new DuplicateUserExceptions();
            }
        }
        clients.add(client);
    }

    @Override
    public void cardInsert(Card card) throws DuplicateCardExceptions {
        for (Card crd : cards) {
            if (crd.getNumberCard() == card.getNumberCard()) {
                throw new DuplicateCardExceptions();
            }

        }
        cards.add(card);
    }

    public boolean checkPinCard(int numberCard, int pin) throws NotFoundCardExceptions {
        for (Card crd : cards) {
            if (crd.getNumberCard() == numberCard && crd.getPin() == pin) {
                return true;
            }
        }
        throw new NotFoundCardExceptions();
    }

    @Override
    public String toString() {
        return "TerminalImpl{" +
                "clients=" + clients +
                ", cards=" + cards +
                '}';
    }
}
