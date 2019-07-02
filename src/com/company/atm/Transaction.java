package com.company.atm;

import com.company.atm.exceptions.DuplicateUserExceptions;

import java.util.Scanner;

public class Transaction {
    private Scanner scn = new Scanner(System.in);
    private TerminalImpl terminal = new TerminalImpl();

    public void workTerminal() throws DuplicateUserExceptions {

        boolean cycle = true;
        while (cycle) {
            System.out.println(
                    "Выбрать 1 Создать клиента\n" +
                            "Выбрать 2 Вставить карту\n" +
                            "Выбрать 3 для выхода из терминала");
            int input = scn.nextInt();
            scn.nextLine();
            switch (input) {
                case 1:
                    boolean loop = true;
                    String inputName = getData("Введите ФИО");
                    String inputPass = getData("Введите номер паспорта");
                    String inputCountry = getData("Введите страну рождения");
                    Client client = new Client(inputName, inputPass, inputCountry);
                    terminal.clientInsert(client);
                    System.out.println(terminal.toString());
                    while (loop) {
                        System.out.println(
                                "Выбрать 1 Создать карту\n" +
                                        "Выбрать 2 Внести деньги на карту\n" +
                                        "Выбрать 3 для выхода из терминала");
                        int inputSelect = scn.nextInt();
                        scn.nextLine();
                        switch (inputSelect) {
                            case 1:
                                terminal.createcard();
                                System.out.println(terminal.toString());
                                break;
                            case 2:
                                break;
                            case 3:
                                loop = false;
                                break;
                            default:
                                System.out.println("Вы выбрали варианта кторого нет");
                                break;
                        }
                    }
                    break;
                case 2:
                    break;

                case 3:
                    System.out.println("Завершение работы с терминалом");
                    cycle = false;
                    break;
                default:
                    System.out.println("Вы выбрали варианта которого нет");
                    break;
            }

        }
    }


    public String getData(String message) {
        System.out.println(message);
        return scn.nextLine();
    }


}
