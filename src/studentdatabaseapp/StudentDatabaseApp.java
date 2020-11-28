package studentdatabaseapp;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.showInfo());

        Student stud2 = new Student();
        stud2.enroll();
        stud2.payTuition();
        System.out.println(stud2.showInfo());

        Student stu3 = new Student();
        stu3.enroll();
        stu3.payTuition();
        System.out.println(stu3.showInfo());

        // Ask how many new users we want to add

        //  Create n number of students
    }
}
