package Week7;

public class ArrayDemo3 {
    public static void main(String[] args) {
        String[][] mains = { {"Genji", "DVA", "Zenyatta"},
                {"Revenant", "Wraith", "Watson"} };
        for (String[] row : mains) {
            for (String colum : row) {
                System.out.printf("%s ", colum);
            }
            System.out.println();
        }
    }
}
