package com.rcs.classwork.Day9;

import java.util.Scanner;

public class DoWhileLoopOne {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        do {
            sum += i;
            System.out.println("sum = " + sum);
            i++;
        }
        while (i <= 10);
    }
}
