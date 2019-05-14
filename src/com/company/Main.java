package com.company;

import com.company.ice_cream_shop.ExtraIceCream;
import com.company.ice_cream_shop.StandartIceCream;
import com.company.ice_cream_shop.SurpriseIceCream;
import com.company.ice_cream_shop.exceptions.ToppingException;
import com.company.ice_cream_shop.topping.CupType;
import com.company.ice_cream_shop.topping.IceCreamType;
import com.company.ice_cream_shop.topping.ToppingType;

import java.util.Scanner;

public class Main {
    private static final int PRINT_ALL_PROFILES = 1;
    private static final int CREATE_USER = 2;
    private static final int EDIT_USER = 3;
    private static final int EXIT_USER = 4;
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        StandartIceCream iceCream = new StandartIceCream();
        SurpriseIceCream s = new SurpriseIceCream();
        ExtraIceCream e = new ExtraIceCream();

        try {
            s.addTopping(ToppingType.FRUCTS);
            e.addTopping(ToppingType.FRUCTS);
            iceCream.addTopping(ToppingType.FRUCTS);
            iceCream.addTopping(ToppingType.CHOCOLATE);
            iceCream.addTopping(ToppingType.FRUCTS);
            iceCream.addTopping(ToppingType.FRUCTS);
            iceCream.addTopping(ToppingType.FRUCTS);
            iceCream.addTopping(ToppingType.FRUCTS);
            iceCream.addTopping(ToppingType.FRUCTS);
        } catch (ToppingException e1) {
            System.out.println(e1.getMessage());
        }

        e.setCupType(CupType.HORN);
        e.setIceCreamType(IceCreamType.CHOCOLATE);
        System.out.println(e.fullPrice());
        iceCream.setCupType(CupType.HORN);
        iceCream.setIceCreamType(IceCreamType.CHOCOLATE);
        System.out.println(iceCream.fullPrice());
        System.out.println(iceCream);
    }

    private static String getData(String message) {
        System.out.println(message);
        return scn.nextLine();
    }

    private static long getDataLong(String message) {
        System.out.println(message);
        return scn.nextLong();
    }

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
                    Profile.profileUser();
                    break;

                case CREATE_USER:
                    String inputNameUser = getData("Введите ФИО");
                    String inpunUserMail = getData("Введите mail");
                    String inputUserLocation = getData("Укажите город проживания");
                    long inputUserPhone = getDataLong("Введите номер телефона");
                    Profile profile = new Profile(inputNameUser, inpunUserMail, inputUserLocation, inputUserPhone);
                    Profile.addProfile(profile);
                    break;

                case EDIT_USER:
                    String mail = getData("Для изменения профиля введите mail");
                    String cNameUser = getData("Введите ФИО");
                    String cUserMail = getData("Введите e-Mail");
                    String cUserLocation = getData("Введите город проживания");
                    System.out.println("Введите номер телефона");
                    long cUserPhone = getDataLong("Введите номер телефона");
                    Profile profileChange = new Profile(cNameUser, cUserMail, cUserLocation, cUserPhone);
                    Profile.changeUser(mail, profileChange);
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

//
//
//    // 2. Определить две константы `a` и `b` типа `Double`, присвоить им любые значения.
//    // Вычислить среднее значение и сохранить результат в переменную `avarage`.
//    private static void cons() {//const*
//        final double a, b;
//        a = 2.65;
//        b = 12.57;
//        double avarage = (a + b) / 2;
//        System.out.println(avarage);
//        // лишняя пустая строка
//    }
//
//    //3. Создать класс, и задать два любых строковых значения с названиями `firstName` и `lastName`.
//    // Далее необходимо вывести в консоль строку в формате "Full name: [firstName] [lastName]".
//    private static void name() {
//        String firstName, lastname;
//        firstName = "Иван";
//        lastname = "Иванов";
//
//        System.out.println("Full name " + firstName + " " + lastname);
//
//        // лишняя пустая строка
//    }
//
//    //4. Напишите программу для вывода первых 15 чисел последовательности Фибоначчи
//    private static void f() {
//        int[] arr = new int[15];
//        int a, b;
//        a = 0;
//        b = 1;
//        arr[0] = 1;
//        for (int i = 1; i < arr.length; i++) { //на соблюден кодСтайл - лайфхак, нажми - ctrl + alt + l - и весь код будет отформатирован по код стайлу
//            int x = a + b;
//            a = b;
//            b = x;
//            arr[i] = x;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//
//    //5. Напишите программу для сортировки массива, использующую метод пузырька.
//    // Сотрировка должна происходить в отдельной функции, принимающей на вход исходный массив
//
//    private static int[] rnd_array() {
//        int[] arr = new int[15];
//        Random rnd = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rnd.nextInt(100);
//
//        }
//
//        return arr;
//        // лишняя пустая строка
//    }
//
//    private static void sortA() {
//        int[] newArr = rnd_array();
//        System.out.println(Arrays.toString(newArr));
//
//        Arrays.sort(newArr);
//        System.out.println(Arrays.toString(newArr));
//        // лишняя пустая строка
//    }
//
//    //6. Напишите программу, решающую задачу: есть входящая строка формата "abc123",
//    // где сначала идет любая последовательность букв, потом число. Необходимо получить новую строку,
//    // в конце которой будет число на единицу больше предыдущего, то есть "abc124".
//    private static void createString() {
//        String word = "sdsdf2344";
//        System.out.println(word);
//        char[] arr = word.toCharArray();
//        arr[arr.length - 1] = (char) (arr[arr.length - 1] + 1);
//        String word1 = new String(arr);
//        System.out.println(word1);
//    }
    //        Profile profile = new Profile(Profile.checkName("павлуша павлушевич"), "mail", "ростов", 112211);
    //   Profile.addProfile(profile);
//        Profile profile1 = new Profile("name".toUpperCase(), "mail", "location", 1231231);
//        Profile.profiles[0] = profile;
//        Profile.profiles[1] = profile1;
//        System.out.println(Arrays.toString(Profile.profiles));
//
//        Profile profile2 = Profile.profiles[0];
//        System.out.println(Arrays.toString(Profile.profiles));

}
