/*
 * Question: Program to illustrate method overloading
 */

package LabPrograms;

class MethodOverloadDemo
{
    public void add1(int a, int b)
    {
        int c = a + b;
        System.out.println("THE ADDITION OF TWO NUMBER IS " + c);
    }
    public void add1(int a, int b, int c)
    {
        int x = a + b + c;
        System.out.println("THE ADDITION OF THREE NUMBER IS " + x);
    }
    public static void main(String args[])
    {
        MethodOverloadDemo m1 = new MethodOverloadDemo();
        m1.add1(10, 20);
        m1.add1(30, 20, 40);
    }
}
