package com.deuterium.exercice_1;

public class MainCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("Default radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());

        System.out.println();
        System.out.println("Initiating with custom radius----------------");
        Circle c2 = new Circle(5.6);
        System.out.println("Default radius: " + c2.getRadius());
        System.out.println("Area: " + c2.getArea());
        System.out.println("Circumference" + c2.getCircumference());

        System.out.println();
        System.out.println("Initiating via other circle----------------");
        Circle c3 = new Circle(c2);
        System.out.println("Default radius: " + c3.getRadius());
        System.out.println("Area: " + c3.getArea());
        System.out.println("Circumference: " + c3.getCircumference());

    }
}
