package SuperCoders.Arrays;

import java.util.*;

public class InsertAtPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        int e = sc.nextInt();
        if (pos > n + 1 || pos <= 0) {
            System.out.println("Invalid position to insert");
        } else {
            for (int i = n; i >= pos; i--) {
                a[i] = a[i - 1];
            }
            a[pos - 1] = e;
            n++;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
