package Week7;
import java.util.Scanner;
public class Activity15 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String[] name = new String[3];
        int[] luckyNumber = new int[3];
        String[] favoriteFlower = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Name:");
            name[i] = console.nextLine();
            System.out.println("Lucky Number:");
            luckyNumber[i] = Integer.parseInt(console.nextLine());
            System.out.println("Favorite Flower:");
            favoriteFlower[i] = console.nextLine();
        }
        System.out.printf("%-10s %-10s %20s\n", "Name:" , "Lucky Number:", "Favorite Flower:");
        for (int i = 0; i < name.length; i++) {
            System.out.printf("%-10s %-10d %12s\n",name[i],luckyNumber[i],favoriteFlower[i]);
        }
    }
}

