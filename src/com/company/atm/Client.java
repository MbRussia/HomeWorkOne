package com.company.atm;

public class Client {
    private int age;
    private String name;

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


    @Override
    public String toString() {
        return "Client{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
