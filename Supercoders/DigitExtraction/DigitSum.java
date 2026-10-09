import java.util.*;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);

        int m = 1, sum = 0;
        while (n > 0) {
            m = n % 10;
            sum += m;
            n = n / 10;
        }
        System.out.print("Sum of digits: " + sum);
        sc.close();
    }
}
