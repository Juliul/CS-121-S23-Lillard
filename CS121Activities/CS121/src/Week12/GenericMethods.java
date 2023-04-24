package Week12;
import java.util.ArrayList;
public class GenericMethods {
    public static <T> void printArrayList(ArrayList<T> arrayList) {
        for (T element : arrayList) {
            System.out.printf(element + " ");
        }
        System.out.println();
    }
}
