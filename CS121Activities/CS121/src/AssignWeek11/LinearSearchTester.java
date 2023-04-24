package AssignWeek11;
import java.util.Scanner;

public class LinearSearchTester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array = {3, 6, 2, 9, 0, 13, 34, 23, 10, 32, 27};
        LinearSearchDemo demo = new LinearSearchDemo();

        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(console.nextLine());

        int found = demo.linearSearch(key, array);
        if (found == -1)
        {
            System.out.println("Item not found.");
        }
        else
        {
            System.out.printf("Item found at index %d, position %d", found, found+1);
        }
    }
}
