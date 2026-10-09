import java.util.*;

public class DigitProd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);

        int m, prod = 1;
        while (n > 0) {
            m = n % 10;
            prod *= m;
            n = n / 10;
        }
        System.out.print("Product of Digits is: " + prod);
        sc.close();
    }
}
