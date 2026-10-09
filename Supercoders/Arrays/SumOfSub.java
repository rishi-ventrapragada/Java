package SuperCoders.Arrays;

import java.util.*;

public class SumOfSub {
    static void subarray(int a[], int n) {
        int i, j, sum;
        for (i = 0; i < n; i++) {
            sum = 0;
            for (j = i; j < n; j++) {
                sum += a[j];
                System.out.print(" " + sum);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        subarray(a, n);

        sc.close();
    }
}
