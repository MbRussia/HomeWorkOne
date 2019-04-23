package com.company;

public class Profile {

    private static Profile[] profiles = new Profile[10];
    private String name;
    private String mail;
    private String location;
    private int phone;

    public Profile(String name, String mail, String location, int phone) {
        this.name = name;
        this.mail = mail;
        this.location = location;
        this.phone = phone;
    }

    public static boolean checkPhone(String phone) {
        return phone.matches("((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
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

    public void addProfile(Profile profile) {

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
