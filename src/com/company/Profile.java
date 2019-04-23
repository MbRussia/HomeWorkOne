package com.company;

import java.util.Date;

public class Profile {

    public static Profile[] profiles = new Profile[2];
    public String name;
    public String mail;
    public String location;
    public Date date;
    public int phone;

//    public void addProfile(Profile profile){
//
//    }

    public Profile(String name, String mail, String location, Date date, int phone) {
        this.name = name;
        this.mail = mail;
        this.location = location;
        this.date = date;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                ", phone=" + phone +
                '}';
    }

    public int auth(String inputUser, String[] mail, String[] id) {
        int authUser = 200;
        for (int i = 0; i < mail.length; i++) {
            if (inputUser.equals(mail[i]) || inputUser.equals(id[i])) {
                authUser = 100;
            }
        }
        return authUser;
    }

    public boolean checkInMail(String mail) {
        return mail.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+");
    }

    public boolean passport(String passport) {
        return passport.matches("\\d{4}\\s\\d{6}");
    }

}
