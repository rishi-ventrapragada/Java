/*
 * Question: 5. Implement a Java Program to illustrate method and constructor overloading (Constructor Overloading)
 */

package LabPrograms;

class Box {
    double length;
    double breadth;
    double height;

    Box() {
        length = 0;
        breadth = 0;
        height = 0;
    }
    Box(double side) {
        length = breadth = height = side;
    }
    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    double volume() {
        return length * breadth * height;
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(4, 3, 2);
        System.out.println("Volume of Box 1: " + b1.volume());
        System.out.println("Volume of Box 2: " + b2.volume());
        System.out.println("Volume of Box 3: " + b3.volume());
    }
}
