import java.util.*;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);

        int m, max = 0;
        while (n > 0) {
            m = n % 10;
            if (m > max) {
                max = m;
            }
            n = n / 10;
        }
        System.out.print(max + " is the biggest digit");
        sc.close();
    }
}
