import java.util.*;
public class pyramid3 {
    public static int stars(int count, int j){
        if(count==0){
            return j;
        }
        System.out.print(j);
        return stars(count-1, j+1);
    }
    
    public static void display(int i, int n, int j){
        if(i<=n){
            System.out.print(" ".repeat(n-i));
            j = stars((2*i)-1, j);
            System.out.println();
            display(i+1, n, j);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        display(1, n, 1);
        sc.close();
    }
}
