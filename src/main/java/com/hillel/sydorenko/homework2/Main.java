package com.hillel.sydorenko.homework2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-50, 50);

        }
        System.out.println("Масив: ");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Цілі пизитивні елеметни масиву: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5 && array[i] < 45) {
                sum += array[i];
            }

            if (array[i] >= 0 && array[i] % 2 == 0){
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Сумма всіх елементів масиву які більше 5 та менше 45: "  + sum);

    }
}
