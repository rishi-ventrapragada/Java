import java.util.*;
public class pyramid2 {
    public static void display(int i, int n){
        if(i<=n){
            System.out.print(" ".repeat(n-i));
            System.out.print("*");
            if(i>1){
                System.out.print(" ".repeat(2*i-3));
                System.out.print("*");
            }
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
