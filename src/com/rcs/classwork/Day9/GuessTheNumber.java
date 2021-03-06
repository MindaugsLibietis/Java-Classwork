package com.rcs.classwork.Day9;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int ran = new Random().nextInt(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("uzmini ciparu [0;9] : ");
        int n = sc.nextInt();
        while (n != ran) {
            if (n > 9 || n < 0){
                System.out.println("Nepareiza ievade, skaitlim jabut no 0 līdz 9");
            } else {
                System.out.println("Nepareizi, mini vēlreiz: ");
            }
            n = sc.nextInt();
        }
        sc.close();
        System.out.println("Pareizi, Tu uzminēji: " + ran + "!");
    }
}
