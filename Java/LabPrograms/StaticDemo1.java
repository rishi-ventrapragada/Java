/*
 * Question: Example for static methods
 */

package LabPrograms;

class StaticDemo2
{
    static void message()
    {
        System.out.println("this is static method");
    }
    void display()
    {
        System.out.println("this is non static method");
    }
}
class StaticDemo1
{
    public static void main(String args[])
    {
        StaticDemo2 s = new StaticDemo2();
        s.display();
        s.message();
    }
}
