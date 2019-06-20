package com.company.oop;

import java.util.ArrayList;
import java.util.Date;

public class Terminal {
    private String address;
    private String timeWork;
    private int id;
    private ArrayList<Card> cards = new ArrayList<>();
    private ArrayList<Client> clients = new ArrayList<>();

    private Card card;
    private Client client;

    public Terminal(String address, String timeWork, int id) {
        this.address = address;
        this.timeWork = timeWork;
        this.id = id;

        getDateFromServer();
    }

    private void getDateFromServer() {
        cards.add(new Card(12345, 1234, "Иван Иванов", 10000, new Date(), 591));
        cards.add(new Card(12345, 1234, "Иван Иванов", 10000, new Date(), 591));
        cards.add(new Card(12345, 1234, "Иван Иванов", 10000, new Date(), 591));


        clients.add(new Client("Иван Иванов", new Date(), 555555, "Россия"));
        clients.add(new Client("Иван Иванов", new Date(), 555555, "Россия"));
        clients.add(new Client("Иван Иванов", new Date(), 555555, "Россия"));
    }

    public boolean checkPin(int numberCard, int pin) {
        for (int i = 0; i < cards.size(); i++) {
            Card getCard = cards.get(i);

            if (getCard.getNumber() == numberCard) {
                if (getCard.getPin() == pin) {
                    card = getCard;

                    for (int j = 0; j < clients.size(); j++) {
                        if (clients.get(j).getName().equals(card.getNameClient())) {
                            client = clients.get(j);
                        }
                    }

                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return false;
    }

    public int getCash() {
        if (card == null) {
            return -1;
        } else {
            return card.getCash();
        }
    }

    public String getInfoClient() {
        return client.toString();
    }
}
