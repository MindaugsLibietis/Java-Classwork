package com.rcs.classwork.Day6;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[]args){
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ievadi skaitli: ");
        if(sc.hasNextDouble()){
            System.out.println(sc.nextDouble());
            x++;
        }
        sc.nextLine();
        System.out.println("ievadi boolean tipa vērtību: ");
        if (sc.hasNextBoolean()){
            System.out.println(sc.nextBoolean());
            x++;
        }
        sc.nextLine();
        System.out.println("ievadi tekstu: ");
        if (sc.hasNextLine()){
            System.out.println(sc.nextLine());
            x++;
        }
        System.out.println("Punktu skaits: " + x);
    }
}
