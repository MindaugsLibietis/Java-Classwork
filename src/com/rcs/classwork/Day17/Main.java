package com.rcs.classwork.Day17;

public class Main {
    public static void main(String[] args) {
        Circle redCircle = new Circle(6.4, "Red");
        Circle yellowCircle = new Circle(2.0, "Yellow");
        Circle cyanCircle = new Circle(3.2, "Cyan");
        Circle blackCircle = new Circle(4.5);
        System.out.print(redCircle);
        System.out.print(yellowCircle);
        System.out.print(cyanCircle);
        System.out.print(blackCircle.toString());
//        System.out.printf("RedCircle -> Color %s, Area = %.2f, Circle Length = %.2f\n", redCircle.Color, redCircle.getArea(), redCircle.getCircleLength());
//        System.out.printf("YellowCircle -> Color %s, Area = %.2f, Circle Length = %.2f\n", yellowCircle.Color, yellowCircle.getArea(), yellowCircle.getCircleLength());
//        System.out.printf("CyanCircle -> Color %s, Area = %.2f, Circle Length = %.2f\n", cyanCircle.Color, cyanCircle.getArea(), cyanCircle.getCircleLength());
//        System.out.printf("BlackCircle -> Color %s, Area = %.2f, Circle Length = %.2f\n", blackCircle.Color, blackCircle.getArea(), blackCircle.getCircleLength());
    }
}
