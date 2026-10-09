package SuperCoders.Arrays;

import java.util.*;

public class InsertInSorted {
    static int insert(int a[], int n, int e) {
        int pos = n + 1, i; // default: append at end
        // finding position to insert
        for (i = 0; i < n; i++) {
            if (e <= a[i]) {
                pos = i + 1;
                break;
            }
        }
        // inserting element at position
        for (i = n; i >= pos; i--) {
            a[i] = a[i - 1];
        }
        a[pos - 1] = e;
        return 1;
    }

    static void display(int a[], int n) {
        int i;
        System.out.println();
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int e = sc.nextInt();
        int x = insert(a, n, e);
        if (x == 1) {
            n++;
        }
        display(a, n);
        sc.close();
    }
}
