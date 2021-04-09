package com.rcs.classwork.abstractionExcamples2;

public abstract class Shape {
    public String name;

    public abstract double area();
    public abstract double perimeter();

    public String getDescription() {
        return String.format("Name: %s, Area: %f, Perimeter: %f", this.name, this.area(), this.perimeter());
    }
}


