package com.rcs.classwork.Day5;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi skaitli :");
        int skaitlis = sc.nextInt();
        if (skaitlis % 2 == 0) {
            System.out.println("Para skaitlis");
        } else {
            System.out.println("Nepara skaitlis");
        }
    }
}
