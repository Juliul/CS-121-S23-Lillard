package Week11;
import java.util.Arrays;
public class selectionTest {
    public static void main(String[] args) {
        selectionSort sorter = new selectionSort();

        int[] array = sorter.getArray();
        System.out.println("Unsorted: " + Arrays.toString(array));

        sorter.SelectionSort(array);
        System.out.println("Selection Sorted: " + Arrays.toString(array));
    }
}
