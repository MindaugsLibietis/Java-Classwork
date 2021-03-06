package com.rcs.classwork.Day9;

import java.util.Scanner;

public class DoWhileLoopThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ludzu ievadiet skaitli : ");
        int sk = sc.nextInt();
        sc.close();
        int i = 1;
        do {
            System.out.println(sk + "*" + i + "=" + (sk * i));
            i++;
        } while (i <= 10);
    }
}
