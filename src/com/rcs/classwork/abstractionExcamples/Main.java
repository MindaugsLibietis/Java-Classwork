package com.rcs.classwork.abstractionExcamples;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IShape> shapeList = new ArrayList<>();

        shapeList.add(new Rectangle(2.0, 3.2));
        shapeList.add(new Circle(4.698));
        shapeList.add(new Triangle(2.0, 3.0, 4.0));

        for (IShape shape : shapeList) {
            if (shape instanceof Rectangle) {
                System.out.println("Rectangle");
            } else if (shape instanceof Circle) {
                System.out.println("Circle");
            } else if (shape instanceof Triangle) {
                System.out.println("Triangle");
            }
            System.out.println(shape.area());
            System.out.println(shape.perimeter());
        }
    }
}
