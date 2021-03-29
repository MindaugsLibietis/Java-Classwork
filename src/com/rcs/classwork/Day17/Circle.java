package com.rcs.classwork.Day17;

public class Circle {
    static final double PI = 3.14159265;

    String Color;
    double radius;

    public Circle(double rad, String clr){
        this.radius = rad;
        this.Color = clr;
    }
    public Circle(double rad){
        this.radius = rad;
        this.Color = "Black";
    }
    public double getArea() {
        return PI * radius * radius;
    }
    public double getCircleLength() {
        return 2 * PI * radius;
    }
}
