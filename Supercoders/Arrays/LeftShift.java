package SuperCoders.Arrays;

import java.util.*;

public class LeftShift {
    // rotates the array left by k positions
    static void leftShift(int a[], int n, int k) {
        if (n == 0) {
            return;
        }
        k = k % n;
        for (int s = 0; s < k; s++) {
            int first = a[0];
            for (int i = 0; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
            a[n - 1] = first;
        }
    }

    static void display(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        leftShift(a, n, k);
        display(a, n);
        sc.close();
    }
}
