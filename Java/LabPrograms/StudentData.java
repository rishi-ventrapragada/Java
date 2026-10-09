/*
 * Question: 1. Implement a Java Program to accept Student Name and Roll Number as command Line Arguments and Display the output
 */

package LabPrograms;

class StudentData {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please provide Student Name and Roll Number.");
            return;
        }

        String stud_name = args[0];
        String roll_Number = args[1];

        System.out.println("Student Name  : " + stud_name);
        System.out.println("Roll Number   : " + roll_Number);
    }
}
