package AssignWeek11;
import java.util.Scanner;
public class BinarySearchTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        BinarySearchDemo demo = new BinarySearchDemo();
        int[] array = {23, 17, 12, 90, 84, 38, 5, 77, 44};
        System.out.print("Unsorted: ");
        for (int num : array)
                System.out.print(num + " ");
        System.out.println();
        // sort array
        int[] sortedArray = selectionSort(array);
        System.out.print("Sorted: ");
        for (int num : sortedArray)
            System.out.print(num + " ");
        System.out.println();

        //search for number
        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(console.nextLine());

        int found = demo.binarySearch(key, sortedArray);
        if (found == -1)
        {
            System.out.println("Item not found.");
        }
        else
        {
            System.out.printf("Item found at index %d, position %d", found, found +1);
        }
    }
    public static int[] selectionSort(int[] unsortedArray)
    {
        int[] sortedArray = unsortedArray;
        for (int i = 0; i < sortedArray.length - 1; i++)
        {
            int min = 1;
            for (int j = i + 1; j < sortedArray.length; j++) {
                // see if element at index j is less than the minimum
                if (sortedArray[j] < sortedArray[min]) {
                    // if it is, we set minimum value to that index number
                    min = j;
                }
            }
            // swap the element at the minimum with the
            // element at the beginning of the unsorted array
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[min];
            sortedArray[min] = temp;
        }
        return sortedArray;
    }
}
