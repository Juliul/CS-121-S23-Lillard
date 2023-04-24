package AssignWeek2;
import java.util.Scanner;
public class Assignment2_LogicalOperators {
    public static void main(String[] args) {
        int num1, num2, num3;
        String greatest;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number");
        num1 = Integer.parseInt(keyboard.nextLine());
        System.out.println("Enter a second number");
        num2 = Integer.parseInt(keyboard.nextLine());
        System.out.println("Enter a third number");
        num3 = Integer.parseInt(keyboard.nextLine());

        if (num1 == num2 && num1 == num3) {
            greatest = "equal";
        } else if (num1 >= num2 && num1 >= num3) {
            greatest = String.valueOf(num1);
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = String.valueOf(num2);
        } else {
            greatest = String.valueOf(num3);
        }

        if (greatest.equals("equal")) {
            System.out.println("All numbers are equal");
        } else {
            System.out.printf("%s is the greatest number", greatest);
        }
        keyboard.close();
    }
}
