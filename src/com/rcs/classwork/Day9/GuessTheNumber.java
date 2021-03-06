package com.rcs.classwork.Day9;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int ran = new Random().nextInt(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("uzmini ciparu no [0;9] : ");
        int n = sc.nextInt();
        while (n != ran) {
            System.out.println("Nepareizi, mini vēlreiz: ");
            n = sc.nextInt();
        }
        sc.close();
        System.out.println("Pareizi, Tu uzminēji: " + ran + "!");
    }
}
