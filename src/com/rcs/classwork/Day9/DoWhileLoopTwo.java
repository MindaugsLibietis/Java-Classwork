package com.rcs.classwork.Day9;

import java.util.Scanner;

public class DoWhileLoopTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ievadiet ludzu tekstu : ");
        String text = sc.nextLine();
        sc.close();
        int i = 0;
        do {
            System.out.println(Character.toUpperCase(text.charAt(i)));
            i++;
        } while (i < text.length());

    }
}
