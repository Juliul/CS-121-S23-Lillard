package AssignWeek3;
import java.util.Scanner;
public class Assignment3_SwitchStatements
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("What is the current month? (as a number)");
        int month = Integer.parseInt(console.nextLine());
        System.out.println("What is the current year?");
        int year = Integer.parseInt(console.nextLine());
        int numDays = 0;

        switch (month)
        {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 9))
                        || (year % 400 == 0))
                        numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.printf("Number of Days = %d",numDays);
        console.close();
    }
}
