/*
 * Question: Implement a Java Program to handle Multiple Exceptions (Option 2)
 */

package JavaLabPrograms2;

import java.util.Scanner;

public class MultipleExceptionsDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            int result = a / b;

            int arr[] = {10, 20, 30};

            System.out.print("Enter array index (0-2): ");
            int index = sc.nextInt();

            System.out.println("Array element: " + arr[index]);
            System.out.println("Result of division: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }

        catch (Exception e) {
            System.out.println("Error: Invalid input.");
        }

        finally {
            System.out.println("Program execution completed.");
            sc.close();
        }
    }
}
