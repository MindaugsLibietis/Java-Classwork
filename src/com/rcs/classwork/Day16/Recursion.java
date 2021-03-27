package com.rcs.classwork.Day16;

import java.util.Scanner;

public class Recursion {
    public static int fibonachi(int n){
        return n > 1 ? fibonachi(n - 1) + fibonachi(n - 2) : n;
        /*if (n  > 1){
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
        return n;*/
    }
    public static int factorial(int n){
        return  n > 1 ? n * factorial(n - 1) : 1;
/*        if (n > 1){
            return  factorial(n - 1) * n;
        } else {
            return n;
        }*/
/*        int result = 1;
        for(int i = n; i > 0; i --){
            result *= i;
        }
        return result;*/
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Ievadi pozitīvu skaitli: ");
            n = sc.nextInt();
        } while (n < 0);
        System.out.printf("%d! = %d\n", n, factorial(n));
        System.out.printf("Fibonachi of %d = %d", n, fibonachi(n));
    }
}
