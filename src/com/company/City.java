package com.company;


public class City {

    public int auth(String inputUser, String[] mail, String[] id) {
        int authUser = 200;
        for (int i = 0; i < mail.length; i++) {
            if (inputUser.equals(mail[i]) || inputUser.equals(id[i])) {
                authUser = 100;
            }
        }
        return authUser;
    }

    public boolean checkInMial(String mail) {

        boolean result = mail.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+");
        return result;
    }

    public boolean passport(String passport) {
        boolean result = passport.matches("\\d{4}\\s\\d{6}");

        return result;
    }

}











