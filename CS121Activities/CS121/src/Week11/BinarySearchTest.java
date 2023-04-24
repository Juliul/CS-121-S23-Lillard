package Week11;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class BinarySearchTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        BinarySearchArray demo = new BinarySearchArray();
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(23, 17, 12, 90, 84, 38, 5, 77, 44));
        System.out.print("Unsorted: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        ArrayList<Integer> sortedArray = selectionSort(array);
        System.out.print("Sorted: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(console.nextLine());

        int found = demo.binarySearch(array,key);
        if (found == -1) {
            System.out.println("Item not found.");

        } else {
            System.out.printf("Item found at index %d, position %d", found, found +1);
        }
    }
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> unsortedArray)
    {
        ArrayList<Integer> sortedArray = unsortedArray;
        for (int i = 0; i < sortedArray.size() - 1; i++)
        {
            int min = 1;
            for (int j = i + 1; j < sortedArray.size(); j++) {
                if (sortedArray.get(j) < sortedArray.get(min)) {
                    min = j;
                }
            }
            int temp = sortedArray.get(i);
            sortedArray.set(i, sortedArray.get(min));
            sortedArray.set(min, temp);
        }
        return sortedArray;
    }
}
