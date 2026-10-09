public class Operations {
    int a = 20, b = 10, c;

    void add() {
        c = a + b;
        System.out.println("a + b = " + c);
    }

    void sub() {
        c = a - b;
        System.out.println("a - b = " + c);
    }

    void mul() {
        c = a * b;
        System.out.println("a * b = " + c);
    }

    void div() {
        c = a / b;
        System.out.println("a / b = " + c);
    }

    public static void main(String args[]) {
        Operations o = new Operations();
        o.add();
        o.sub();
        o.mul();
        o.div();
    }
}
