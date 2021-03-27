package com.rcs.classwork.Day16;

import com.rcs.classwork.Day16Classes.StringUtils;

import java.util.Scanner;

public class StringTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();
        System.out.printf("Text middle : %s\n", StringUtils.getMiddle(text));
        System.out.printf("Text reverse : %s\n", StringUtils.getReverse(text));
        System.out.printf("Text is Palindrome : %s\n", StringUtils.isPalindrome(text));
    }
}
