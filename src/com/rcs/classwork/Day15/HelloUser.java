package com.rcs.classwork.Day15;

import java.util.Scanner;

public class HelloUser {
    public static void sayHello(String param) {
        System.out.println("Hello " + param + "!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jūsu vārds :");
        String x = sc.nextLine();
        sayHello(x);
    }
}
