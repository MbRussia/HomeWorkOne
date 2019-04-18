package com.company;

import java.util.Arrays;
import java.util.Random;

public class City {

    private int max, min;

    public City(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public int rnd(int a, int b) {
        int deltaRnd = b - a;
        Random rnd = new Random();
        int number = rnd.nextInt(deltaRnd + 1);
        number += a;
        return number;
    }

    public int[] house() {
        int[] house = new int[rnd(10, 50)];
        for (int i = 0; i < house.length; i++) {
            house[i] = i + 1;
        }
        System.out.println(Arrays.toString(house));
        return house;
    }

    public int[] apartmetn() {
        int[] apartmetn = new int[house().length];
        for (int i = 0; i < apartmetn.length; i++) {
            apartmetn[i] = rnd(0, 6);
        }
        //System.out.println(Arrays.toString(apartmetn));
        return apartmetn;
    }

}
