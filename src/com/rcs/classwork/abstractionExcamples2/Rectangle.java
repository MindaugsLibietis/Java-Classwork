package com.rcs.classwork.abstractionExcamples2;

public class Rectangle extends Shape{
    private double length, width;

    public Rectangle(String name, double length, double width){
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
}

