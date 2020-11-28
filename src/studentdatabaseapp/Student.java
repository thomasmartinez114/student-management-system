package studentdatabaseapp;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Random;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
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
    }

    // Generate an 5 digit ID
    private void setStudentID() {
        // Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;

    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits 0 when done enrolling
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance += costOfCourse;
            }
            else {
                break;
            }
        } while (1 != 0);
    }

    // View balance
    public void viewBalance(){
        System.out.println("Your Balance is: $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        if (payment != 0) {
            tuitionBalance -= payment;
            System.out.println("Thank you for your payment of $" + payment);
        }
        else {
            System.out.println("No payment made at this time. Thank you.");
        }
        viewBalance();
    }

    // Show status
    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
