package Week12;
import java.util.ArrayList;
import java.util.Arrays;

public class GenericMain {
    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon"));

        System.out.print("Integer arrayList: ");
        genericMethods.printArrayList(intList);
        System.out.print("Double arrayList: ");
        genericMethods.printArrayList(doubleList);
        System.out.print("Char arrayList: ");
        genericMethods.printArrayList(charList);
        System.out.print("String arrayList: ");
        genericMethods.printArrayList(stringList);
    }
}
