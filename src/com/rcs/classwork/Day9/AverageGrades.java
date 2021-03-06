package com.rcs.classwork.Day9;

import java.util.Arrays;

public class AverageGrades {
    public static void main(String[]args){
        int[] grades = {9, 2, 4, 5, 6, 7, 8, 5, 4};
        int sum = 0;
        System.out.println(Arrays.toString(grades));
        for (int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        float average = (float)sum / grades.length;
        System.out.printf("Average : %.2f ", average);
    }
}
