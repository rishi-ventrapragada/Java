import java.util.*;

public class Duck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int i;
        boolean startZero = (s.charAt(0) == '0');
        boolean hasZero = false;

        for (i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                hasZero = true;
            }
        }

        if (!startZero && hasZero) {
            System.out.print(s + " is a Duck Number");
        } else {
            System.out.print(s + " is not a Duck Number");
        }
        sc.close();
    }
}
