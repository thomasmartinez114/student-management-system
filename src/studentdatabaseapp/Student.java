package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1001;

    // Constructor: prompts user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student's First Name: " );
        this.firstName = in.nextLine();

        System.out.print("Enter Student's Last Name: " );
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Student's Grade Level: " );
        this.gradeYear = in.nextInt();
        System.out.println(firstName + " " + lastName + " " + gradeYear);
    }

    // Generate an 5 digit ID

    // Enroll in courses

    // View balance

    // Pay tuition

    // Show status
}
