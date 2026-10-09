package SuperCoders.Arrays;

import java.util.*;

public class DeleteInSorted {
    static int delete(int a[], int n, int e) {
        int pos = -1;
        // finding the element (array is sorted, so stop once we pass it)
        for (int i = 0; i < n && a[i] <= e; i++) {
            if (a[i] == e) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Element not found");
            return 0;
        }
        for (int i = pos; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        return 1;
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
        int e = sc.nextInt();

        if (delete(a, n, e) == 1) {
            n--;
        }
        display(a, n);
        sc.close();
    }
}
