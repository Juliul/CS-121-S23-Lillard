package AssignWeek12;
public class Main {
    public static void main(String[] args) {
        GenericMethods generic = new GenericMethods();
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
        String[] stringArray = {"Alpha", "Beta", "Gamma", "Delta", "Epsilon"};

        System.out.print("Integer array: ");
        generic.printArray(intArray);
        System.out.print("Double array: ");
        generic.printArray(doubleArray);
        System.out.print("Char array: ");
        generic.printArray(charArray);
        System.out.print("String array: ");
        generic.printArray(stringArray);
    }
}
