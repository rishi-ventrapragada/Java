/*
 * Question: Program to find total, average of given two numbers by using static methods
 */

package LabPrograms;

public class Week1
{
    public static void tot(int a, int b)
    {
        int total = a + b;
        int avg = total / 2;
        System.out.println("THE SUM OF TWO NUMBER IS " + total);
        System.out.println("THE AVERAGE OF TWO NUMBER IS " + avg);
    }
    public static void main(String args[])
    {
        tot(56, 90);
    }
}
