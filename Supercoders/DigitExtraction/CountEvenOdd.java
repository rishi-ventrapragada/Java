import java.util.*;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);

        int even = 0, odd = 0, m;
        while (n > 0) {
            m = n % 10;
            if (m % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            n = n / 10;
        }
        System.out.print("even: " + even + " odd: " + odd);
        sc.close();
    }
}
