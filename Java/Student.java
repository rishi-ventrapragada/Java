public class Student {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide Student Name and Roll Number");
            return;
        }

        String name = args[0];
        String roll_no = args[1];

        System.out.println("Student Name : " + name);
        System.out.println("Roll Number : " + roll_no);
    }
}
