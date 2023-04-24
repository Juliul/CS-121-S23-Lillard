package AssignWeek12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Steve");
        names.add("Jack");

        //Display elements of names list
        //initialize iterator by calling collection's
        //iterator method
        Iterator<String> iter = names.iterator();
        while(iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        }
        // Remove Elements
        /*
        while(iter.hasNext()) {
            String name = (String)iter.next();
            if (name.equals("Alice"));
            {
                iter.remove();
            }
        }
       while(iter.hasNext())
        {
            String name = (String)iter.next();
            System.out.println(name);
        }
       for(String name : names)
        {
            System.out.println(name);
        }
        */
        //Display the remaining elements after the next element

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Amy","Joe","Lisa"));
        Iterator<String> i = namesList.iterator();
        i.next();
        i.forEachRemaining(System.out::println);
        //The double colon is a special operator. The target reference is
        //before the delimiter (::) and the name of the method is placed after
        // "where we want to print to" :: "the print method"
    }
}
