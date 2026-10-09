package SuperCoders.Arrays;

import java.util.*;

public class DeleteAtPos {
    static int delete(int a[], int n, int pos) {
        if (pos <= 0 || pos > n) {
            System.out.println("Invalid position to delete");
            return 0;
        }

        for (int i = pos - 1; i < n - 1; i++) {
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
        int pos = sc.nextInt();

        int x = delete(a, n, pos);
        if (x == 1) {
            n--; //
            System.out.print("Array after deletion: ");
            display(a, n); // Fix 3: Added display call to print results
        }

        sc.close();
    }
}
