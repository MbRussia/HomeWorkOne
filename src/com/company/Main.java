package com.company;

import com.company.ice_cream_shop.StandartIceCream;
import com.company.ice_cream_shop.topping.CupType;

import java.util.Scanner;

public class Main {
    private static final int EXIT_BUY_ICECREAME = 5;
    private static final int SELECT_ICE_CREAM = 0;
    private static Scanner scn = new Scanner(System.in);


    private static String getIceCreamData(String message) {
        System.out.println(message);
        return scn.nextLine();
    }

    private static String getCupTypes() {
        StringBuilder cupTypes = new StringBuilder();

        for (CupType type : CupType.values()) {
            cupTypes.append(type.name()).append("\n");
        }

        return cupTypes.toString();
    }

    public static void main(String[] args) {
        boolean loop = true;
        while (loop) {
            System.out.println("Чтобы произвести покупку мороженного введите - 0\n" +
                    "Для выхода нажмите - 5");

            int input = scn.nextInt();
            scn.nextLine();

            switch (input) {
                case SELECT_ICE_CREAM:
                    StandartIceCream standartIceCream = new StandartIceCream();

                    String cup = getIceCreamData("Выберите Стаканчик из списка:\n" + getCupTypes());

                    standartIceCream.setCupType(CupType.valueOf(cup));

                    break;

                case EXIT_BUY_ICECREAME:
                    loop = false;
                    break;

                default:
                    System.out.println("Вы не выбрали ни одни вариант");
                    break;
            }

        }

//        StandartIceCream iceCream = new StandartIceCream();
//        SurpriseIceCream s = new SurpriseIceCream();
//        ExtraIceCream e = new ExtraIceCream();
//        e.addTopping(ToppingType.FRUCTS);
//        e.setCupType(CupType.HORN);
//        e.setIceCreamType(IceCreamType.CHOCOLATE);
//        System.out.println(e.fullPrice());
//        s.addTopping(ToppingType.FRUCTS);
//        iceCream.setCupType(CupType.HORN);
//        iceCream.addTopping(ToppingType.CHOCOLATE);
//        iceCream.addTopping(ToppingType.FRUCTS);
//        iceCream.setIceCreamType(IceCreamType.CHOCOLATE);
//        System.out.println(iceCream.fullPrice());
//        System.out.println(iceCream);
    }
}
