import java.util.*;

public class Pattern3 {
    public static void stars(int j, int n){
        if(j<=n){
            System.out.print("* ");
            stars(j+1, n);
        }
    }

    public static void display(int i, int n){
        if(i>=1){
            stars(1, i);
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
