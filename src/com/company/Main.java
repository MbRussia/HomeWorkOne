package com.company;

import com.company.ice_cream_shop.StandartIceCream;
import com.company.ice_cream_shop.SurpriseIceCream;
import com.company.ice_cream_shop.TextOutput;
import com.company.ice_cream_shop.exceptions.ToppingException;
import com.company.ice_cream_shop.topping.CupType;
import com.company.ice_cream_shop.topping.IceCreamType;
import com.company.ice_cream_shop.topping.ToppingType;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int EXIT_BUY_ICE_CREAM = 5;
    private static final int SELECT_ICE_CREAM = 0;
    private static Scanner scn = new Scanner(System.in);
    private static boolean loop = true;

    private static String getData(String message) {
        System.out.println(message);
        return scn.nextLine();
    }

    private static int getIntData(String message) {
        System.out.println(message);

        int i = -1;

        try {
            i = scn.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Неправильный формат ввода!");
        }

        scn.nextLine();
        return i;
    }

    private static String getCupTypes() {
        StringBuilder cupTypes = new StringBuilder();

        for (CupType type : CupType.values()) {
            cupTypes.append(type.name()).append("\n");
        }

        return cupTypes.toString();
    }

    public static void main(String[] args) throws ToppingException {

        while (loop) {
            int input = getIntData("Чтобы произвести покупку мороженного введите - 0\n" +
                    "Для выхода нажмите - 5");

            switch (input) {

                case SELECT_ICE_CREAM:
                    input = getIntData("Какое мороженное Вы хотите?\n Стандартное - 1\n Сюрприз - 2\n Экстра - 3\n" +
                            "Для выхода нажмите - 5");

                    if (input == 1) {
                        createStandardIceCream();
                    } else if (input == 2) {
                        createSurpriseIceCream();
                    } else if (input == 3) {
                        createExtraIceCream();
                    } else {
                        System.out.println("Нет такого варианта!");
                    }
                    break;
                case EXIT_BUY_ICE_CREAM:
                    loop = false;
                    break;
                default:
                    System.out.println(TextOutput.getMessage(TextOutput.DEFAULT));
                    break;
            }
        }

    }

    private static void createSurpriseIceCream() throws ToppingException {
        Random rnd = new Random();
        SurpriseIceCream surpriseIceCream = new SurpriseIceCream();
        switch (rnd.nextInt(CupType.values().length)) {
            case 0:
                surpriseIceCream.setCupType(CupType.HORN);
                break;
            case 1:
                surpriseIceCream.setCupType(CupType.CUP);
                break;
            default:
                break;
        }
        switch (rnd.nextInt(IceCreamType.values().length)) {
            case 0:
                surpriseIceCream.setIceCreamType(IceCreamType.CHOCOLATE);
                break;
            case 1:
                surpriseIceCream.setIceCreamType(IceCreamType.CREAMY);
                break;
            default:
                break;
        }
        int toppingTypeRandom = 0;
        while (toppingTypeRandom < 2) {
            switch (rnd.nextInt(ToppingType.values().length)) {
                case 0:
                    surpriseIceCream.addTopping(ToppingType.FRUCTS);
                    break;
                case 1:
                    surpriseIceCream.addTopping(ToppingType.NUT);
                    break;
                case 2:
                    surpriseIceCream.addTopping(ToppingType.CHOCOLATE);
                    break;
                default:
                    break;
            }
            toppingTypeRandom++;
        }
        System.out.println("Вы выбрали мороженное: \n" +
                "Eмкость - " + surpriseIceCream.getCupType() + "\n" +
                "Mороженное - " + surpriseIceCream.getIceCreamType() + "\n" +
                "Топпинг - " + surpriseIceCream.getTopping());
        System.out.println("Сумма покупки составляет " + surpriseIceCream.fullPrice());
    }

    private static void createExtraIceCream() {

    }


    private static void createStandardIceCream() {
        int input;

        StandartIceCream standartIceCream = new StandartIceCream();
        boolean loopSelectCupIceCream = true;
        while (loopSelectCupIceCream) {
            input = getIntData("Выберите емкость из списка: \n" +
                    "1 - Стаканчик\n" +
                    "2 - Рожок\n" +
                    "0 - Выход");
            switch (input) {
                case 1:
                    standartIceCream.setCupType(CupType.CUP);
                    loopSelectCupIceCream = false;
                    break;
                case 2:
                    standartIceCream.setCupType(CupType.HORN);
                    loopSelectCupIceCream = false;
                    break;
                case 0:
                    loopSelectCupIceCream = false;
                    break;
                default:
                    System.out.println("Вы не выбрали ни один вариант");
                    break;
            }
        }
        boolean loopSelectCreamType = true;
        while (loopSelectCreamType) {

            input = getIntData("Какой тип мороженного ?\n 1 - Ванильное \n 2 - Шоколадное \n 0 - Выход");

            switch (input) {
                case 1:
                    standartIceCream.setIceCreamType(IceCreamType.CREAMY);
                    loopSelectCreamType = false;
                    break;
                case 2:
                    standartIceCream.setIceCreamType(IceCreamType.CHOCOLATE);
                    loopSelectCreamType = false;
                    break;
                case 0:
                    loopSelectCreamType = false;
                    break;
                default:
                    System.out.println("Не правильное значение");
                    break;

            }
        }

        boolean loopSelectToppings = true;
        while (loopSelectToppings) {
            input = getIntData("Какой тип топпинга ?\n 1 - Шоколад \n 2 - Орехи \n 3 - Фрукты \n0 - Выход");
            try {
                switch (input) {
                    case 1:
                        standartIceCream.addTopping(ToppingType.CHOCOLATE);
                        break;
                    case 2:
                        standartIceCream.addTopping(ToppingType.NUT);
                        break;
                    case 3:
                        standartIceCream.addTopping(ToppingType.FRUCTS);
                        break;
                    case 0:
                        loopSelectToppings = false;
                        break;
                    default:

                }
            } catch (ToppingException e) {
                System.out.println(e.getMessage());
                loopSelectToppings = false;
            }
        }
        System.out.println("Вы выбрали мороженное: \n" +
                "Eмкость - " + standartIceCream.getCupType() + "\n" +
                "Mороженное - " + standartIceCream.getIceCreamType() + "\n" +
                "Топпинг - " + standartIceCream.getTopping());
        System.out.println("Сумма покупки составляет " + standartIceCream.fullPrice());
    }
}
