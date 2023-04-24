package AssignWeek13;
import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args)
    {
        // initialize a LinkedList
        LinkedList<String> names = new LinkedList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Carol");

        // display list
        System.out.printf("Names list: %s%n", names);

        // add first and last elements
        names.addFirst("John");
        names.addLast("Rhonda");

        System.out.printf("Names list: %s%n", names);

        // get values in a LinkedList
        Object firstElement = names.getFirst();
        Object lastElement = names.getLast();
        Object firstItem = names.get(0);
        //Object lastItem = new.get(4);
        System.out.printf("First element is %s and last element is %s%n",
                firstElement, lastElement);
        System.out.printf("First item is %s and last item is %s%n",
                firstItem);//lastItem);

        // set values and add to a position in a LinkedList
        names.set(0, "Tom");
        System.out.printf("Names list: %s%n", names);
        names.add(0, "Clark");
        System.out.printf("Names list: %s%n", names);

        // remove elements from a list
        names.remove(0);
        System.out.printf("Names list: %s%n", names);
        names.removeFirst();
        System.out.printf("Names list: %s%n", names);
        names.removeLast();
        System.out.printf("Names list: %s%n", names);
    }
}
