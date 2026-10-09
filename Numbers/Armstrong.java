import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);
        int a = n;
        int m, sum = 0;
        while (n > 0) {
            m = n % 10;
            sum += (m * m * m);
            n /= 10;
        }
        if (sum == a) {
            System.out.print(a + " is an Armstrong number");
        } else {
            System.out.print(a + " is not an Armstrong number");
        }
        sc.close();
    }
}
