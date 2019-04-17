package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        cons();
        name();
        f();
        rnd_array();
        sortA();
        createString();
    }

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
