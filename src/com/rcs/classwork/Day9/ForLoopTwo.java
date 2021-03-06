package com.rcs.classwork.Day9;

import java.util.Scanner;

public class ForLoopTwo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ievadiet ludzu tekstu : ");
        String text = sc.nextLine();
        sc.close();
        for(int i = 0; i < text.length(); i++){
            System.out.println(Character.toUpperCase(text.charAt(i)));
        }
    }
}
