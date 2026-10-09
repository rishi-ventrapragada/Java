/*
 * Question: Example: Program using try, catch and finally blocks (class renamed from ExceptionDemo to avoid a clash)
 */

package JavaLabPrograms2;

class ExceptionFinallyDemo
{
    public static void main(String[] args)
    {
        try {
            int a = 10, b;
            b = a / 0;
            System.out.println("value" + b);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception raised division by zero");
        }
        finally
        {
            System.out.println("this block always executes..");
        }
        System.out.println("quit");
    }
}
