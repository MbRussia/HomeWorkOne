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
        System.out.println("Введите Mail");
        boolean result = mail.matches("^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$;");

        return result;
    }

}











