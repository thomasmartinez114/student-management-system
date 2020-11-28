package studentdatabaseapp;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Random;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor: prompts user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student's First Name: " );
        this.firstName = in.nextLine();

        System.out.print("Enter Student's Last Name: " );
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Student's Grade Level: " );
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    // Generate an 5 digit ID
    private void setStudentID() {
        // Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;

    }

    // Enroll in courses

    // View balance

    // Pay tuition

    // Show status
}
