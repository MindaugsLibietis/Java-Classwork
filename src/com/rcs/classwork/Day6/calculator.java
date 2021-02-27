package com.rcs.classwork.Day6;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ievadiet decimālskaitli a :");
        double a = sc.nextDouble();
        System.out.println("ievadiet decimālskaitli b :");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("ievadiet darbību (+,-,/,*) :");
        String darbiba = sc.nextLine();
        sc.close();
        switch (darbiba) {
            case "+":
                System.out.println("a + b = " + (a + b));
                break;
            case "-":
                System.out.println("a - b" + (a - b));
                break;
            case "/":
                System.out.println("a / b" + (a / b));
                break;
            case "*":
                System.out.println("a * b" + (a * b));
            default:
                System.out.println("error");
        }
    }
}
