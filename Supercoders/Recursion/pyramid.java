import java.util.*;

public class pyramid {
    public static void display(int i, int n){
        if(i<=n){
            System.out.print(" ".repeat(n-i));
            System.out.print("*".repeat(2*i-1));
            System.out.println();
            display(i+1, n);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        display(1, n);
        sc.close();
    }
}
