package com.company.atm;

public class Card {
    private String clientName;
    private int cash;
    private int numberCard;
    private int pin;


    public Card(int numberCard) {
        this.numberCard = numberCard;
    }

    public Card(int cash, int numberCard, int pin) {
        this.cash = cash;
        this.numberCard = numberCard;
        this.pin = pin;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getCash() {

        return cash;
    }

    public void setCash(int cash) {

        this.cash = cash;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public int getPin() {

        return pin;
    }

    public void setPin(int pin) {

        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Card{" +
                "clientName='" + clientName + '\'' +
                ", cash=" + cash +
                ", numberCard=" + numberCard +
                ", pin=" + pin +
                '}';
    }
}
