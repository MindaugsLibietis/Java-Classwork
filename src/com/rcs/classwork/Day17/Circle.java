package com.rcs.classwork.Day17;

public class Circle {
    static final double PI = 3.14159265;
    static final String defaultColor = "Black";

    String Color;
    double radius;

    public Circle(double rad){
        this.radius = rad;
        this.Color = defaultColor;
    }
    public Circle(double rad, String clr){
        this.radius = rad;
        this.Color = clr;
    }
    public double getArea() {
        return PI * this.radius * this.radius;
    }
    public double getCircleLength() {
        return 2 * PI * this.radius;
    }
    @Override
    public String toString(){
        return String.format("Color %s, Area = %.2f, Circle Length = %.2f\n", this.Color, this.getArea(), this.getCircleLength());
    }
}
