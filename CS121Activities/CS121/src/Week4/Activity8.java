package Week4;
import java.util.Scanner;
public class Activity8 {
    public static void main(String[] args) {
        TestAverage();
    }
    public static void TestAverage() {
        float average = 0, tests;
        int aveScore = 0, students, score, i, j;
        // tells user purpose of application
        Scanner input = new Scanner(System.in);
        System.out.println("This applications will average test scores for the entered number of students.");
        //prompt for number of students
        System.out.println("Enter number of students");
        students = input.nextInt();
        //prompt for number of test
        System.out.println("Enter number of tests per student");
        tests = input.nextInt();
        //nest loop allow user to enter all the test score and receive averages consecutively
        for(i = 1; i <= students; i++)
        {
            System.out.println("Student number "+ i);
            System.out.println("-----------------");
            for (j = 1; j <= tests; j++){
                System.out.print("Enter score " + j + ": ");
                score = input.nextInt();
                aveScore = aveScore + score;
                average = aveScore/ tests;
            }
            System.out.printf("The average score for student " + i + " is %.2f\n", average);
            aveScore = 0;
            average = 0;
        }
    }
}
