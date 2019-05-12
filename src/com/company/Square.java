
package com.company;

import java.util.ArrayList;
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
        int root = 0;
        int x = 0;

        char[] textArr = text.toCharArray();
        while (x < text.length()) {
            root++;
            x = root * root;
        }
        System.out.println(root);
        System.out.println(Arrays.toString(stringWords(textArr)));

        StringBuffer stringBuffer = new StringBuffer(root);

        ArrayList<String> squareString = new ArrayList<>(root);

        String[] stringWords = stringWords(textArr);
        int z = 0;
        for (int i = 0; i < stringWords.length; i++) {

            if (z == 0 && (stringBuffer.length() + stringWords[i].length()) <= root) {
                stringBuffer.append(stringWords[i]);
                z++;
                continue;
            }
            if ((stringBuffer.length() + stringWords[i].length()) <= root) {
                stringBuffer.append(" " + stringWords[i]);
            } else {
                if (stringBuffer.length() == root) {
                    squareString.add(stringBuffer.toString());

                    stringBuffer.delete(0, stringBuffer.length());
                    z = 0;
                } else {
                    boolean loop = true;
                    int j = 0;
                    while (loop) {
                        if (stringBuffer.length() == root) {
                            loop = false;
                        }
                        if (stringBuffer.charAt(j) == ' ') {
                            stringBuffer.insert(j, " ");
                            j++;
                        }
                        if (j == stringBuffer.length() - 1) {
                            j = 0;
                        } else {
                            j++;
                        }
                    }
                    squareString.add(stringBuffer.toString());

                    stringBuffer.delete(0, stringBuffer.length());
                    i--;
                    z = 0;
                }

            }

        }

        for (String s : squareString) {
            System.out.println(s);
        }

    }


    private static String[] stringWords(char[] textArr) {

        String[] stringWords = new String[numWords(textArr)];
        int from = 0;
        int key = 0;
        for (int i = 0; i < textArr.length; i++) {
            if (textArr[i] == ' ') {
                if (key == 0) {
                    stringWords[key] = String.valueOf(Arrays.copyOfRange(textArr, from, i));
                } else {
                    stringWords[key] = String.valueOf(Arrays.copyOfRange(textArr, from + 1, i));
                }
                key++;
                from = i;
                if (key + 1 == numWords(textArr)) {
                    stringWords[key] = String.valueOf(Arrays.copyOfRange(textArr, from, textArr.length));
                }
            }
        }
        return stringWords;
    }

    private static int numWords(char[] arr) {
        int numWords = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                numWords++;
            }
        }
        return numWords;
    }

}