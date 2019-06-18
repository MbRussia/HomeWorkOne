package com.company;

import com.company.atm.TerminalImpl;
import com.company.atm.exceptions.IncorrectPinExceptions;
import com.company.atm.exceptions.NotFoundCardExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TerminalImpl terminal = new TerminalImpl();
        Scanner sc = new Scanner(System.in);
        boolean loop = true;


        while (loop) {
            System.out.println("Введите номер карты:");
            int numberCard = sc.nextInt();

            System.out.println("Введите пин код:");
            int pin = sc.nextInt();

            try {
                terminal.checkPinCard(numberCard, pin);


                System.out.println("1 - Посмотреть баланс \n 0 - Выход \n");
                int i = sc.nextInt();


                switch (i) {
                    case 1:
                        break;

                    case 0:
                        loop = false;
                        break;
                }


            } catch (IncorrectPinExceptions incorrectPinExceptions) {
                System.out.println(incorrectPinExceptions.getLocalizedMessage());
            } catch (NotFoundCardExceptions notFoundCardExceptions) {
                System.out.println(notFoundCardExceptions.getLocalizedMessage());
            }


        }


    }
}
