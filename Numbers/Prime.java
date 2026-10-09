import java.util.*;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int prime = 1;
        if (n < 2) {
            prime = 0;
        }
        for (i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime = 0;
            }
        }
        if (prime == 1) {
            System.out.print("Prime Number");
        } else {
            System.out.print("Not a Prime Number");
        }
        sc.close();
    }
}
