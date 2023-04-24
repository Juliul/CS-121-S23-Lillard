package AssignWeek4;
import java.util.Scanner;
public class Assignment7_NestedForLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int classes;
        int daysStudying;
        int hoursStudying;
        int hours;

        System.out.println("Enter number of classes");
        classes = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number of days spent studying each week");
        daysStudying = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= classes; i++) {
            hoursStudying = 0;
            System.out.printf("Class number %d\n", i);
            System.out.println("-".repeat(14));
            for (int j = 1; j < daysStudying; j++) {
                System.out.printf("Enter hours spent studying for Class %d on day %d:\n", i, j);
                hours = Integer.parseInt(scanner.nextLine());
                hoursStudying += hours;
            }
            System.out.printf("Total number of hourse spend each week studying for " +
                    "Class %d\n\n", i, hoursStudying);
        }
    }
}