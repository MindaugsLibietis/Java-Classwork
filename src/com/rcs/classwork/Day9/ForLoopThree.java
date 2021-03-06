package com.rcs.classwork.Day9;

import java.util.Scanner;

public class ForLoopThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ludzu ievadiet skaitli : ");
        int sk = sc.nextInt();
        sc.close();
        for (int i = 1; i <= sk; i++) {
            System.out.printf("%d * %d = %d\n", sk, i, sk * i);
        }
    }
}
