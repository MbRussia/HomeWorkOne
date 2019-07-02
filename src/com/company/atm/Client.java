package com.company.atm;

public class Client {

    private String name;
    private String serialPassport;
    private String country;

    public Client(String name, String serialPassport, String country) {
        this.name = name;
        this.serialPassport = serialPassport;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialPassport() {
        return serialPassport;
    }

    public String getName() {
        return name;
    }

    public void setSerialPassport(String serialPassport) {
        this.serialPassport = serialPassport;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Client{");
        sb.append("name='").append(name).append('\'');
        sb.append(", serialPassport=").append(serialPassport);
        sb.append(", country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
