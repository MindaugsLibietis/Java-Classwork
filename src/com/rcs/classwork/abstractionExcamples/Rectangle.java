package com.rcs.classwork.abstractionExcamples;

public class Rectangle implements IShape {
    private double length, width;

    public Rectangle(double length, double width){
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
