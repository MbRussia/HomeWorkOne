package com.company;

import java.util.Arrays;

public class Profile {

    public static Profile[] profiles = new Profile[10];
    private String name;
    private String mail;
    private String location;
    private long phone;

    public Profile(String name, String mail, String location, long phone) {
        this.name = checkName(name);
        this.mail = mail;
        this.location = checkLocation(location);
        this.phone = phone; // так как болеан нельзя вводить, нодо проверять наверное в свиче
    }


    public static boolean checkPhone(String phone) {
        return phone.matches("((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
    }

    public static void profileUser() {
        for (Profile p : profiles) {
            if (p != null) {
                System.out.println(p.toString());
            }
        }
    }

    public static void changeUser(String mail, Profile profile) {
        for (int i = 0; i < profiles.length; i++) {
            if (profiles[i].mail.equals(mail)) {
                profiles[i] = profile;
                break;
            }
        }
    }
    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", location='" + location + '\'' +
                ", phone=" + phone +
                '}';
    }


    public boolean checkInMail(String mail) {
        return mail.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+");
    }

    public boolean passport(String passport) {
        return passport.matches("\\d{4}\\s\\d{6}");
    }

    public static void addProfile(Profile profile) {
        for (int i = 0; i < profiles.length; i++) {
            if (profiles[i] == null) {
                profiles[i] = profile;
                break;
            }
        }
        System.out.println(Arrays.toString(profiles));
    }

    public String checkLocation(String location) {
        return location.substring(0, 1).toUpperCase() + location.substring(1);
    }

    public String checkName(String name) {
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        char[] charName = name.toCharArray();

        for (int i = 0; i < charName.length; i++) {
            if (charName[i] == ' ') {
                charName[i + 1] = Character.toUpperCase(charName[i + 1]);
            }
        }
        return name = new String(charName);
    }

}
