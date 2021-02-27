package com.rcs.classwork.Day6;

import java.util.Scanner;

public class WeridOrNot {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ievadi vesalu skaitli: ");
        int sk = sc.nextInt();
        sc.close();
        if (sk %2 == 1){
            System.out.println("divaini");
        }else if (sk %2 == 0 && sk >= 2 && sk <= 5){
            System.out.println("nav divaini");
        }else if (sk %2 == 0 && sk >= 6 && sk <= 20){
            System.out.println("divaini");
        }else if (sk %2 == 0 && sk > 20){
            System.out.println("nav divaini");
        }
    }
}
