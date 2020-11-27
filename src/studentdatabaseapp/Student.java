package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    // Constructor: prompts user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student's First Name:" );
        this.firstName = in.nextLine();

        System.out.print("Enter Student's Last Name:" );
        this.lastName = in.nextLine();

        System.out.print("Enter Student's Grade Level:" );
        this.gradeYear = in.nextLine();
    }

    // Generate an 5 digit ID

    // Enroll in courses

    // View balance

    // Pay tuition

    // Show status
}
