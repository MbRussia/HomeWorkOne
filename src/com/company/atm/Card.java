package com.company.atm;

public class Card {
    private int number;
    private int pin;
    private String nameClient;
    private int cash;
    private int cvc;

    public Card(int number, int pin, String nameClient, int cash, int cvc) {
        this.number = number;
        this.pin = pin;
        this.nameClient = nameClient;
        this.cash = cash;
        this.cvc = cvc;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getNumber() {
        return number;
    }

    public int getPin() {
        return pin;
    }

    public String getNameClient() {
        return nameClient;
    }

    public int getCash() {
        return cash;
    }

    public int getCvc() {
        return cvc;
    }
}

