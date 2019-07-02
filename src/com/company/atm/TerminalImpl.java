package com.company.atm;

import com.company.atm.exceptions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class TerminalImpl implements Terminal {
    private String address;
    private String timeWork;
    private int id;
    private ArrayList<Card> cards = new ArrayList<>();
    private ArrayList<Client> clients = new ArrayList<>();
    private Card card;
    private Client client;


    @Override
    public int getCash() throws NotFoundCardExceptions {
        if (card == null) {
            throw new NotFoundCardExceptions();
        } else {
            return card.getCash();
        }
    }


    @Override
    public int transaction(int transaction) throws NoMoneyExceptions {
        if ((card.getCash() + transaction) <= 0) {
            throw new NoMoneyExceptions();
        } else {
            card.setCash(card.getCash() + transaction);
        }
        return card.getCash();
    }

    @Override
    public boolean clientInsert(Client client) throws DuplicateUserExceptions {
        if (clients.size() == 0) {
            clients.add(client);
            return true;
        }
        for (int i = 0; i < clients.size(); i++) {
            if (!client.getName().equals(clients.get(i).getName())) {
                clients.add(client);
                return true;
            } else {
                throw new DuplicateUserExceptions();
            }
        }
        return false;
    }

    @Override
    public boolean cardInsert(Card card) throws DuplicateCardExceptions {
        if (cards.size() == 0) {
            cards.add(card);
            return true;
        }
        for (int i = 0; i < cards.size(); i++) {
            if (card.getNumber() == cards.get(i).getNumber()) {
                cards.add(card);
                return true;
            } else {
                throw new DuplicateCardExceptions();
            }
        }
        return false;
    }

    @Override
    public boolean deleteCard() {
        return cards.remove(card);
    }

    @Override
    public boolean deleteClient() {
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getNameClient().equals(client.getName())) {
                iterator.remove();
            }
        }
        return clients.remove(client);
    }

    @Override
    public void createcard() {
        Random rnd = new Random();
        Card card = new Card(rnd.nextInt(10000), rnd.nextInt(1000), client.getName(), 0, rnd.nextInt(999));
        cards.add(card);
    }

    public boolean checkPin(int numberCard, int pin) throws NotFoundCardExceptions, IncorrectPinExceptions {
        for (int i = 0; i < cards.size(); i++) {
            Card getCard = cards.get(i);
            if (getCard.getNumber() == numberCard) {
                if (getCard.getPin() == pin) {
                    card = getCard;
                    for (int j = 0; j < clients.size(); j++) {
                        if (card.getNameClient().equals(clients.get(j).getName())) {
                            client = clients.get(j);
                        }
                    }
                    return true;
                } else {
                    throw new IncorrectPinExceptions();
                }

            } else {
                throw new NotFoundCardExceptions();
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "TerminalImpl{" +
                "address='" + address + '\'' +
                ", timeWork='" + timeWork + '\'' +
                ", id=" + id +
                ", cards=" + cards +
                ", clients=" + clients +
                '}';
    }
}
