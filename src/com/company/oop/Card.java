package com.company.oop;

import java.util.Date;

public class Card {
    private int number;
    private int pin;
    private String nameClient;
    private int cash;
    private Date date;
    private int cvc;

    public Card(int number, int pin, String nameClient, int cash, Date date, int cvc) {
        this.number = number;
        this.pin = pin;
        this.nameClient = nameClient;
        this.cash = cash;
        this.date = date;
        this.cvc = cvc;
    }

    public int getNumber() {
        return number;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getNameClient() {
        return nameClient;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public Date getDate() {
        return date;
    }

    public int getCvc() {
        return cvc;
    }
}
