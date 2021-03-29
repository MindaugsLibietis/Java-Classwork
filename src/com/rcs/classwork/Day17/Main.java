package com.rcs.classwork.Day17;

public class Main {
    public static void main(String[] args) {
        Circle redCircle = new Circle(6.4, "Red");
        Circle yellowCircle = new Circle(2.0, "Yellow");
        Circle cyanCircle = new Circle(3.2, "Cyan");
        Circle blackCircle = new Circle(4.5);
        System.out.println("RedCircle -> %s, Area = %f, Circle Length = %f\n" redCircle.Color, redCircle.getArea(), redCircle.getCircleLength());
        System.out.println("YellowCircle -> %s, Area = %f, Circle Length = %f\n" yellowCircle.Color, yellowCircle.getArea(), yellowCircle.getCircleLength());
        System.out.println("CyanCircle -> %s, Area = %f, Circle Length = %f\n" cyanCircle.Color, cyanCircle.getArea(), cyanCircle.getCircleLength());
        System.out.println("BlackCircle -> %s, Area = %f, Circle Length = %f\n" blackCircle.Color, blackCircle.getArea(), blackCircle.getCircleLength());
    }
}
