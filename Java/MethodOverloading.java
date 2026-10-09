public class MethodOverloading {
    public void add1(int a, int b) {
        int c = a + b;
        System.out.println("The addition of two numbers is: " + c);
    }

    public void add1(int a, int b, int c) {
        int x = a + b + c;
        System.out.println("The addition of three numbers is:" + x);
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.add1(10, 20);
        m.add1(30, 20, 40);
    }
}
