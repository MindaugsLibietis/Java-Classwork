package com.rcs.classwork.Day5;

import java.util.Scanner;

public class CheckPassFail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ludzu ievadiet atzīmi :");
        int atzime = sc.nextInt();
        sc.close();
        if (atzime >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}
