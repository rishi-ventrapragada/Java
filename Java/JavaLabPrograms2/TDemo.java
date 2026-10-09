/*
 * Question: Example: program to demonstrate throw keyword
 */

package JavaLabPrograms2;

class TDemo
{
    void divide(int i, int j) throws ArithmeticException
    {
        if (j == 0)
            throw new ArithmeticException("demo exception");
        int c = i / j;
        System.out.println(c);
    }
    public static void main(String[] args)
    {
        TDemo t = new TDemo();
        t.divide(2, 0);
    }
}
