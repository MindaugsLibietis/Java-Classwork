package com.rcs.classwork.Day7;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("teksts1 : ");
        String teksts1 = sc.nextLine();
        System.out.println("teksts2 : ");
        String teksts2 = sc.nextLine();
        if (teksts1.length() < teksts2.length()){
            System.out.println(teksts1 + teksts2.toUpperCase() + teksts1);
        }else {
            System.out.println(teksts2 + teksts1.toUpperCase() + teksts2);
        }
    }
}
