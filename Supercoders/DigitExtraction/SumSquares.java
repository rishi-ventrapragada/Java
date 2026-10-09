import java.util.*;

public class SumSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);

        int m, prod = 1, sum = 0;
        while (n > 0) {
            m = n % 10;
            prod = m * m;
            sum += prod;
            n /= 10;
        }
        System.out.print("Sum of squares of digits: " + sum);
        sc.close();
    }
}
