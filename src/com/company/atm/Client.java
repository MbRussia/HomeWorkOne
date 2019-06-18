package com.company.atm;

import java.util.ArrayList;

public class Client {
    private int age;
    private String name;
    private ArrayList<Card> cards = new ArrayList<>();

    public Client(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        card.setClientName(name);
        cards.add(card);
    }

    @Override
    public String toString() {
        return "Client{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
