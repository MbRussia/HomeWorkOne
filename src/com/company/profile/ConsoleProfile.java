package com.company.profile;

import java.util.Scanner;

public class ConsoleProfile {
    private static final int PRINT_ALL_PROFILES = 1;
    private static final int CREATE_USER = 2;
    private static final int EDIT_USER = 3;
    private static final int EXIT_USER = 4;
    private static Scanner scn = new Scanner(System.in);
    private static Profile profile = new Profile("", "", "", 0);

    public static void createProfile() {
        boolean loop = true;
        while (loop) {
            System.out.println(
                    "Выбрать 1 для просмотра всех профайлов \n" +
                            "Выбрать 2 для регстрации нового профайла \n" +
                            "Выбрать 3 для редактирвания профайла \n" +
                            "Выбрать 4 для завершения программы");

            int input = scn.nextInt();
            switch (input) {

                case PRINT_ALL_PROFILES:
                    System.out.println("Все профайлы");
                    profile.profileUser();
                    break;

                case CREATE_USER:
                    String inputNameUser = getData("Введите ФИО");
                    String inpunUserMail = getData("Введите mail");
                    String inputUserLocation = getData("Укажите город проживания");
                    long inputUserPhone = getDataLong("Введите номер телефона");
                    profile = new Profile(inputNameUser, inpunUserMail, inputUserLocation, inputUserPhone);
                    profile.addProfile(profile);
                    break;

                case EDIT_USER:
                    String mail = getData("Для изменения профиля введите mail");
                    String cNameUser = getData("Введите ФИО");
                    String cUserMail = getData("Введите e-Mail");
                    String cUserLocation = getData("Введите город проживания");
                    System.out.println("Введите номер телефона");
                    long cUserPhone = getDataLong("Введите номер телефона");
                    Profile profileChange = new Profile(cNameUser, cUserMail, cUserLocation, cUserPhone);
                    profile.changeUser(mail, profileChange);
                    break;

                case EXIT_USER:
                    loop = false;
                    break;

                default:
                    System.out.println("Вы выбрали вариант которго нет.");
                    break;

            }
        }
    }

    private static String getData(String message) {
        System.out.println(message);
        return scn.nextLine();
    }

    private static long getDataLong(String message) {
        System.out.println(message);
        return scn.nextLong();
    }
}
