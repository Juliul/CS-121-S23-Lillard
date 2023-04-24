package Week11;
import java.util.Arrays;
public class bubbleTest {

    public static void main(String[] args) {
        // create an instance of the Sorting class
        // so that we can run the public methods from it
        bubbleSort sorter = new bubbleSort();

        int[] array = sorter.getArray();
        System.out.println("Unsorted: " + Arrays.toString(array));

        sorter.BubbleSort(array);
        System.out.println("Bubble Sorted: " + Arrays.toString(array));
    }
}
