import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, temp;
        boolean flag = false;
        while (a <= n) {
            if (a == n) {
                flag = true;
                break;
            }
            temp = b;
            b = b + a;
            a = temp;
        }
        if (flag == true) {
            System.out.println(n + " is a Fibonacci Number");
        } else {
            System.out.println(n + " is a not a Fibonacci Number");
        }
        sc.close();
    }
}
