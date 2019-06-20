package com.company.oop;

import java.util.Date;

public class Client {
    private String name;
    private Date date;
    private int serialPassport;
    private String country;

    public Client(String name, Date date, int serialPassport, String country) {
        this.name = name;
        this.date = date;
        this.serialPassport = serialPassport;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public int getSerialPassport() {
        return serialPassport;
    }

    public void setSerialPassport(int serialPassport) {
        this.serialPassport = serialPassport;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Client{");
        sb.append("name='").append(name).append('\'');
        sb.append(", date=").append(date);
        sb.append(", serialPassport=").append(serialPassport);
        sb.append(", country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
