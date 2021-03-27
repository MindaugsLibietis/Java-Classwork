package com.rcs.classwork.Day16;

public class MethodOverLoading {
    public static int sum(int x, int y) {
        return x + y;
    }
    public static int sum(int x, int y, int z) {
        //return x + y + z;
        return sum(x,y) + z;
    }
    public static float sum(float x, float y) {
        return x + y;
    }
    public static float sum(float x, float y, float z) {
        return x + y + z;
        //return sum(x,y) + z;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,6));
        System.out.println(sum(8,8,9));
        System.out.println(sum(8.1f,8.2f));
        System.out.println(sum(5.5f,3.4f,5.8f));
    }

}
