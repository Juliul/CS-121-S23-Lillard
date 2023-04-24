package AssignWeek7;
import java.util.Scanner;
public class Assignment15_Arrays {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String[] firstNames = new String[5];
        String[] lastNames = new String[5];
        int[] ages = new int[5];

        for (int i = 0; i < 5; i++)
        {
            System.out.println("First name: ");
            firstNames[i] = console.nextLine();
            System.out.println("Last name: ");
            lastNames[i] = console.nextLine();
            System.out.println("Age: ");
            ages[i] = Integer.parseInt(console.nextLine());
            System.out.println();
        }
        System.out.printf("%-14s %s\n", "Name", "Age");

        for (int i = 0; i < firstNames.length; i++)
        {
            System.out.printf("%-14s %d\n", firstNames[i] + " " +lastNames[i], ages[i]);
        }
        console.close();
    }
}
