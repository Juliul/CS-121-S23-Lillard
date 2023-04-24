package AssignWeek4;
import java.util.Scanner;
public class Assignment6_WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String course;

        System.out.println("Please enter all of your courses.");
        System.out.println();
        while (true) {
            System.out.println("Enter a course or \"q\" to quit");
            course = scanner.nextLine();
            if (course.equals("q")) {
                break;
            } else {
                System.out.println(course);
            }
        }
        System.out.println();
        System.out.println("Thank you.");
        scanner.close();
    }
}
