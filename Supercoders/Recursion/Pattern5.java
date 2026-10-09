import java.util.*;

public class Pattern5 {
    public static void display(int i, int n){
        if(i>=1){
            System.out.print(" ".repeat((n-i)*2));
            System.out.print("* ".repeat(i));
            System.out.println();
            display(i-1, n);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        display(n, n);
        sc.close();
    }
}
