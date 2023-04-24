package AssignWeek12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Amy",
                "Joe", "Lisa"));
        ListIterator<String> iter = names.listIterator();

        /* Traverse and display list in forward direction */
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }
        System.out.println();
        /* Traverse and display list in backward direction */
        while (iter.hasPrevious())
        {
            System.out.println(iter.previous());
        }
    }
}
