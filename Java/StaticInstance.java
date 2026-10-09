public class StaticInstance {
    static void demo1() {
        System.out.println("Static method");
    }

    void demo2() {
        System.out.println("Instance method");
    }

    public static void main(String[] args) {
        StaticInstance o = new StaticInstance();
        o.demo2();
        StaticInstance.demo1();
    }
}
