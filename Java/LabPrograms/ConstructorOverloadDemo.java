/*
 * Question: Program to illustrate constructor overloading
 */

package LabPrograms;

class ConstructorOverloadDemo
{
    int x, y;
    ConstructorOverloadDemo(int a, int b)
    {
        x = a;
        y = b;
        System.out.println(a + " " + b);
    }
    ConstructorOverloadDemo(int a)
    {
        x = a;
        System.out.println(a);
    }
    ConstructorOverloadDemo()
    {
        System.out.println("no parameters");
    }
    public static void main(String args[])
    {
        ConstructorOverloadDemo m1 = new ConstructorOverloadDemo(10, 20);
        ConstructorOverloadDemo m2 = new ConstructorOverloadDemo(30);
        ConstructorOverloadDemo m3 = new ConstructorOverloadDemo();
    }
}
