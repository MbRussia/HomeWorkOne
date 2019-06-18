package com.company.atm;

import com.company.atm.exceptions.DuplicateCardExceptions;
import com.company.atm.exceptions.DuplicateUserExceptions;
import com.company.atm.exceptions.IncorrectPinExceptions;
import com.company.atm.exceptions.NotFoundCardExceptions;

import java.util.ArrayList;

public class TerminalImpl implements Terminal {
    private ArrayList<Client> clients = new ArrayList<>();
    private Card currentCard;
    private Client currentClient;

    @Override
    public int getCash() {
        return currentCard.getCash();
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
        for (Client cl : clients) {
            for (Card crd : cl.getCards()) {
                if (crd.getNumberCard() == card.getNumberCard()) {
                    throw new DuplicateCardExceptions();
                }
            }
        }

        currentClient.addCard(card);
    }

    public boolean checkPinCard(int numberCard, int pin) throws NotFoundCardExceptions, IncorrectPinExceptions {
        for (Client cl : clients) {
            for (Card crd : cl.getCards()) {
                if (crd.getNumberCard() == numberCard) {
                    if (crd.getPin() == pin) {
                        currentClient = cl;
                        currentCard = crd;
                        return true;
                    } else {
                        throw new IncorrectPinExceptions();
                    }
                }
            }
        }

        throw new NotFoundCardExceptions();
    }

    @Override
    public String toString() {
        return "TerminalImpl{" +
                "clients=" + clients +
                '}';
    }
}
