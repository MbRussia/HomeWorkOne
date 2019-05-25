package com.company;

import com.company.ice_cream_shop.StandartIceCream;
import com.company.ice_cream_shop.TextOutput;
import com.company.ice_cream_shop.exceptions.ToppingException;
import com.company.ice_cream_shop.topping.CupType;
import com.company.ice_cream_shop.topping.IceCreamType;
import com.company.ice_cream_shop.topping.ToppingType;

import java.util.InputMismatchException;
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

    public static void main(String[] args) {

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

    private static void createSurpriseIceCream() {

    }

    private static void createExtraIceCream() {

    }


    private static void createStandardIceCream() {
        int input;


        StandartIceCream standartIceCream = new StandartIceCream();

        String cup = getData(TextOutput.getMessage(TextOutput.SELECT_CUP) + getCupTypes());

        standartIceCream.setCupType(CupType.valueOf(cup));

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


                System.out.println(standartIceCream.getTopping());
            } catch (ToppingException e) {
                System.out.println(e.getMessage());
                loopSelectToppings = false;
            }
        }

        System.out.println(standartIceCream.fullPrice());


    }
}
