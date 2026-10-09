/*
 * Question: Program to illustrate class and object
 */

package LabPrograms;

class ArithmeticDemo
{
    public void add1(int a, int b)
    {
        int c = a + b;
        System.out.println("THE ADDITION OF TWO NUMBER IS " + c);
    }
    public void subtract1(int a, int b)
    {
        int c = a - b;
        System.out.println("THE SUBTRACTION OF TWO NUMBER IS " + c);
    }
    public void multiply1(int a, int b)
    {
        int c = a * b;
        System.out.println("THE MULTIPLICATION OF TWO NUMBER IS " + c);
    }
    public void divide1(int a, int b)
    {
        int c = a / b;
        System.out.println("THE DIVISION OF TWO NUMBER IS " + c);
    }
    public static void main(String args[])
    {
        ArithmeticDemo d1 = new ArithmeticDemo();
        d1.add1(10, 20);
        d1.subtract1(40, 20);
        d1.multiply1(30, 20);
    }
}
