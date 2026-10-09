package SuperCoders.Arrays;

import java.util.*;

public class MaxSOSub {
    static void subarray(int a[], int n) {
        int i, j, sum, max = -214000;
        for (i = 0; i < n; i++) {
            sum = 0;
            for (j = i; j < n; j++) {
                sum += a[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.print(" " + max);
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
