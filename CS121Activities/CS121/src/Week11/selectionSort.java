package Week11;
import java.util.Scanner;
public class selectionSort {
    public static int[] SelectionSort(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            //int min = 1;
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
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

