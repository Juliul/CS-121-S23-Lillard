package AssignWeek11;
import java.util.Scanner;

//BubbleSort
public class SortingTest {
    public static void main(String[] args) {
        // create an instance of the Sorting class
        // so that we can run the public methods from it
        Sorting sorter = new Sorting();

        int[] array = {30,16,24,62,25,7};

        System.out.print("Unsorted: ");
        printArray(array);

        sorter.ascendingBubbleSort(array);
        System.out.print("Sorted ascending: ");
        printArray(array);

        System.out.println();

        sorter.descendingBubbleSort(array);
        System.out.print("Sorted descending: ");
        printArray(array);

        System.out.println();

        int[] array3 = {3, 6, 2, 9, 0, 13, 34, 23, 10, 32, 27};
        sorter.mergeSort(array3);
        printArray(array3);

        sorter.selectionSort(array);
        System.out.println("Selection Sorted: ");
        printArray(array);

        sorter.insertionSort(array);
        System.out.println("Insertion Sorted: ");
        printArray(array);
    }

    // static method to print an array
    // static means we don't have to create an instance
    // of the this class to call the method
    public static void printArray(int[] array) {
        for (int num: array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void linearSearchTester(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int [] array = {3, 6, 2, 9, 0, 13, 34, 23, 10, 32, 27};
        Sorting demo = new Sorting();

        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(console.nextLine());

        int found = demo.linearSearch(key, array);
        if (found == -1)
        {
            System.out.println("Item not found.");
        }
        else
        {
            System.out.printf("Item found at index %d, position %d", found, found +1);
        }
    }
}
