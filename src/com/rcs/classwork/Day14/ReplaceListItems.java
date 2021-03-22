package com.rcs.classwork.Day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReplaceListItems {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        Random rnd = new Random();
        int n = rnd.nextInt(16)+5;
        for (int i = 0; i < n; i ++){
            int number = rnd.nextInt(101);
            numberList.add(number);
            System.out.printf("%4d ", number);
        }
        System.out.println();
        for (int i = 0; i < numberList.size(); i++){
            if (numberList.get(i) <= 39){
                numberList.set(i, 0);
            }
            System.out.printf("%4d ", numberList.get(i));
        }
    }
}
