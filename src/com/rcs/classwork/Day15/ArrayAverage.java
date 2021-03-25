package com.rcs.classwork.Day15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayAverage {
    public static float getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (float)sum / array.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet masīva izmēru: ");
        int izm = sc.nextInt();
        int[] array = new int[izm];
        Random ran = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = ran.nextInt(101);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(getAverage(array));
    }
}
