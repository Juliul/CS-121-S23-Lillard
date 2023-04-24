package Week13;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Student {
    Scanner input = new Scanner(System.in);
    String firstName;
    String lastName;
    int ID = 0;
    String major;
    String classStanding;
    float gpa;
    String courseList;
    LinkedList studentCourses = new LinkedList();

    public Student(String firstName, String lastName, int ID, String major, String classStanding, float gpa) {
        getStudentInfo();
        addCourse();
        displayStudentCourses();
        removeCourse();
        displayStudentCourses();
        displayAll();
    }
    public void addCourse() {
        int x;
        System.out.println("Enter the number of courses you have: ");
        x = Integer.parseInt(input.nextLine());
        for (int i = 0; i < x; i++) {
            System.out.println("Enter " + i + " course: ");
            String s = input.nextLine();
            studentCourses.add(s);
        }
    }
    public void removeCourse() {
        String continues;
        System.out.println("Would you like to remove a course, yes or no: ");
        continues = input.nextLine();
        while (continues.equals("yes")) {
            System.out.println("What course would you like to remove: ");
            int j = Integer.parseInt(input.nextLine());
            studentCourses.remove(j);
            System.out.println("Would you like to remove another course, yes or no: ");
            continues = input.nextLine();

        }
    }
    public String[] getStudentInfo() {
        String[] studentInfo = new String[5];
        System.out.println("Please enter your first name: ");
        firstName = input.nextLine();
        //firstName= studentInfo[0];
        System.out.println("Please enter your last name: ");
        lastName = input.nextLine();
        //lastName = studentInfo[1];
        System.out.println("Please enter your ID: ");
        ID = Integer.parseInt(input.nextLine());
        //ID = Integer.parseInt(studentInfo[2]);
        System.out.println("Please enter your major: ");
        major = input.nextLine();
        //major = studentInfo[3];
        System.out.println("Please enter your class standing: ");
        classStanding = input.nextLine();
        //classStanding = studentInfo[4];
        System.out.println("Please enter your GPA: ");
        gpa = Float.parseFloat(input.nextLine());
        //gpa = Float.parseFloat(studentInfo[5]);
        return studentInfo;
    }
    public void displayStudentCourses() {
        System.out.println("Courses: ");
        for (int i = 0; i < studentCourses.size(); i++) {
            System.out.print(i);
            System.out.printf("\t" + studentCourses.get(i));
            System.out.println();

        }
    }
    public void displayAll() {
        System.out.println("--------------");
        System.out.println("Full name: " + firstName + " " + lastName);
        System.out.println("ID: " + ID);
        System.out.println("Major: " + major);
        System.out.println("Class Standing: " + classStanding);
        System.out.println("GPA: " + gpa);
        System.out.println("Courses: ");
        for (int i = 0; i < studentCourses.size(); i++) {
            System.out.print(i);
            System.out.printf("\t" + studentCourses.get(i));
            System.out.println();

        }
        System.out.println("--------------");
    }
}
