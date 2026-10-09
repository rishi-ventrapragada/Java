import java.util.*;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, sum = 0;
        for (i = 1; i <= n - 1; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.print(n + " is a Perfect Number");
        } else {
            System.out.print(n + " is not a Perfect Number");
        }
        sc.close();
    }
}
