package com.rcs.classwork.Day12;

import java.util.Random;

public class Reverse2DArray {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = rnd.nextInt(5)+2;
        int m = rnd.nextInt(5)+2;
        int[][] array2D = new int [n][m];
        for (int i = 0; i < array2D.length; i++){
            for (int j = 0; j < array2D[i].length; j++){
                array2D[i][j] = rnd.nextInt(101);
            }
        }
        System.out.println();
        for (int[] row : array2D){
            for (int column : row){
                System.out.printf("%4d", column);
            }
            System.out.println();
        }
        for (int i = 0; i < array2D.length / 2; i++){
                int oppositeIndex = array2D.length - i - 1;
                int[] temp = array2D[i];
                array2D[i] = array2D[oppositeIndex];
                array2D[oppositeIndex] = temp;
        }
        System.out.println();
        for (int[] row : array2D){
            for (int column : row){
                System.out.printf("%4d", column);
            }
            System.out.println();
        }
    }
}
