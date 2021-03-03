package com.rcs.classwork.Day8;

import java.util.Scanner;

public class WhileLoopThree {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ludzu ievadiet skaitli : ");
        int sk = sc.nextInt();
        int i = 1;
        while (i <= 10){
            System.out.println(sk + "*" + i + "=" + (sk * i));
            i++;
        }
    }
}
