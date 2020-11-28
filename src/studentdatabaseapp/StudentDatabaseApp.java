package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        // Ask how many new users we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in); // then create array of students to enroll
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents]; // array created

        //  Create n number of students
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();

            System.out.println(students[n].showInfo());
        }
    }
}
