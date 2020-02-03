package com.deuterium.exercice_2;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("Width: " + r.getWidth());
        System.out.println("Length: " + r.getLength());
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());

        System.out.println();
        System.out.println("Initiating with custom values----------------");
        Rectangle r1 = new Rectangle(5.143f, 6.5874f);
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Length: " + r1.getLength());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());


        System.out.println();
        System.out.println("Initiating via other rectangle----------------");
        Rectangle r2 = new Rectangle(r1);
        System.out.println("Width: " + r2.getWidth());
        System.out.println("Length: " + r2.getLength());
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

    }
}
