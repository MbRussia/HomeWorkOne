package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Profile profile = new Profile("name", "mail", "location", new Date(), 1231231);
//        Profile profile1 = new Profile("name".toUpperCase(), "mail", "location", new Date(), 1231231);
//        Profile.profiles[0] = profile;
//        Profile.profiles[1] = profile1;
//        System.out.println(Arrays.toString(Profile.profiles));
//        Profile profile2 = Profile.profiles[0];
//        System.out.println(Arrays.toString(Profile.profiles));
        boolean loop = true;
        while (loop) {
            System.out.println("Выбрать 1 для просмотра всех профайлов \n" +
                    "Выбрать 2 для выхода из программы");
            Scanner scn = new Scanner(System.in);
            int input = scn.nextInt();
            switch (input) {
                case 1:
                    System.out.println("все профайлы");
                    for (Profile p : Profile.profiles) {
                        System.out.println(p.toString());
                    }
                    break;
                case 2:
                    loop = false;

            }
        }

    }

//        String[] mail = new String[10];
//        String[] id = new String[10];
//        mail[3] = "mail";
//        id[3] = "id";
//
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Введите данные для авторизации");
//        String inputUser = scn.nextLine();
//        City city = new City();
//        if (city.auth(inputUser, mail, id) == 100) {
//            System.out.println("выводятся данные юзера");
//        } else {
//            String passport = scn.nextLine();
//            System.out.println(city.passport(passport));
//        }


    // 2. Определить две константы `a` и `b` типа `Double`, присвоить им любые значения.
    // Вычислить среднее значение и сохранить результат в переменную `avarage`.
    private static void cons() {//const*
        final double a, b;
        a = 2.65;
        b = 12.57;
        double avarage = (a + b) / 2;
        System.out.println(avarage);
        // лишняя пустая строка
    }

    //3. Создать класс, и задать два любых строковых значения с названиями `firstName` и `lastName`.
    // Далее необходимо вывести в консоль строку в формате "Full name: [firstName] [lastName]".
    private static void name() {
        String firstName, lastname;
        firstName = "Иван";
        lastname = "Иванов";

        System.out.println("Full name " + firstName + " " + lastname);

        // лишняя пустая строка
    }

    //4. Напишите программу для вывода первых 15 чисел последовательности Фибоначчи
    private static void f() {
        int[] arr = new int[15];
        int a, b;
        a = 0;
        b = 1;
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) { //на соблюден кодСтайл - лайфхак, нажми - ctrl + alt + l - и весь код будет отформатирован по код стайлу
            int x = a + b;
            a = b;
            b = x;
            arr[i] = x;
        }
        System.out.println(Arrays.toString(arr));
    }

    //5. Напишите программу для сортировки массива, использующую метод пузырька.
    // Сотрировка должна происходить в отдельной функции, принимающей на вход исходный массив

    private static int[] rnd_array() {
        int[] arr = new int[15];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);

        }

        return arr;
        // лишняя пустая строка
    }

    private static void sortA() {
        int[] newArr = rnd_array();
        System.out.println(Arrays.toString(newArr));

        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));
        // лишняя пустая строка
    }

    //6. Напишите программу, решающую задачу: есть входящая строка формата "abc123",
    // где сначала идет любая последовательность букв, потом число. Необходимо получить новую строку,
    // в конце которой будет число на единицу больше предыдущего, то есть "abc124".
    private static void createString() {
        String word = "sdsdf2344";
        System.out.println(word);
        char[] arr = word.toCharArray();
        arr[arr.length - 1] = (char) (arr[arr.length - 1] + 1);
        String word1 = new String(arr);
        System.out.println(word1);
    }
}
