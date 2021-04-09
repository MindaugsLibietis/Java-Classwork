package com.rcs.classwork.abstractionExcamples2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapeList = new ArrayList<>();

        shapeList.add(new Rectangle("Kvadrāts",2.0, 3.2));
        shapeList.add(new Circle("Aplis",4.698));
        shapeList.add(new Triangle("Trijstūris",2.0, 3.0, 4.0));

        for (Shape shape : shapeList) {
            if (shape instanceof Rectangle) {
                System.out.println("Rectangle");
            } else if (shape instanceof Circle) {
                System.out.println("Circle");
            } else if (shape instanceof Triangle) {
                System.out.println("Triangle");
            }
            System.out.println(shape.getDescription());

        }
    }
}
