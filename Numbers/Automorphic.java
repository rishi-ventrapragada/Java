import java.util.*;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Math.abs(sc.nextLong());

        long m = n * n;
        int digits = 1;
        long temp = n;
        while (temp >= 10) {
            digits++;
            temp /= 10;
        }

        long mod = 1;
        for (int i = 0; i < digits; i++) {
            mod *= 10;
        }

        if (m % mod == n) {
            System.out.println("Its automorphic no");
        } else {
            System.out.println("Its not automorphic no");
        }
        sc.close();
    }
}
