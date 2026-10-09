/*
 * Question: 5. Implement a Java Program to illustrate method and constructor overloading (Method Overloading)
 */

package LabPrograms;

class Calculator {
    void add(int a, int b) {
        System.out.println("Addition of two integers: " + (a + b));
    }
    void add(int a, int b, int c) {
        System.out.println("Addition of three integers: " + (a + b + c));
    }
    void add(double a, double b) {
        System.out.println("Addition of two doubles: " + (a + b));
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        System.out.println();

        c1.add(10, 20);
        c1.add(10, 20, 30);
        c1.add(3.5, 4.5);
    }
}
