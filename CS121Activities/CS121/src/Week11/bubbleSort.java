package Week11;
import java.util.Scanner;
public class bubbleSort {

    public static int[] BubbleSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int index = 0; index < array.length - i - 1; index++) {
                if (array[index] > array[index + 1]) {
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
        return array;
    }
    public static int[] getArray() {
        Scanner console = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++){
            System.out.println("What number would you like to add?");
            array[i] = console.nextInt();
        }
        return array;
    }
}
