package com.company;

import java.util.Arrays;

public class Square {


    public static void SquareText() {
        String text = "Java is a general-purpose computer programming language that " +
                "is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible. " +
                "It is intended to let application developers write once, run anywhere, meaning that compiled Java code can run on all platforms " +
                "that support Java without the need for recompilation. Java applications are typically compiled to bytecode that can run on any Java virtual " +
                "machine regardless of computer architecture. As of 2016, Java is one of the most popular programming languages in use, " +
                "particularly for client-server web applications, with a reported 9 million developers. Java was originally developed by James Gosling " +
                "at Sun Microsystems and released in 1995 as a core component of Sun Microsystems' Java platform.";
        char[] textArr = text.toCharArray();
        int root = 0;// количество символов
        int x = 0; // извлечение корня большего отчисла
        int y = 1; // количество слов

        while (root < textArr.length) {
            x++;
            root = x * x;
        }

        for (int i = 0; i < textArr.length; i++) {
            if (textArr[i] == ' ') {
                y++;
            }
        }
        System.out.println(x);
        String[] stringWord = new String[y];

        int from = 0;
        int k = 0;
        for (int j = 0; j < textArr.length; j++) {

            if (textArr[j] == ' ') {
                if (k == 0) {
                    stringWord[k] = String.valueOf(Arrays.copyOfRange(textArr, from, j));
                } else {
                    stringWord[k] = String.valueOf(Arrays.copyOfRange(textArr, from + 1, j));
                }
                k++;
                from = j;
            }
            if (k + 1 == y) {
                stringWord[k] = String.valueOf(Arrays.copyOfRange(textArr, from + 1, textArr.length));
            }
        }
        int[] numberWordCheck = new int[y];
        for (int i = 0; i < stringWord.length; i++) {
            numberWordCheck[i] = stringWord[i].length();
        }
        String[] suqareText = new String[x];
        int z = 0;
        for (int i = 0; i < stringWord.length; i++) {
            if (i == 0) {
                suqareText[z] = stringWord[i].concat(" " + stringWord[i + 1]);
            }

        }


        System.out.println(Arrays.toString(suqareText));
    }


}



