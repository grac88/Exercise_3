package com.max.idea;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1,3,45,33,20};

        int temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;
        System.out.println(Arrays.toString(array));

        int average;
        average = array[0] + array[array.length/2];
        System.out.println("Сумма первого и среднего значения: " + average);

    }
}
