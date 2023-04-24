package Week3;
import java.util.Scanner;
public class Activity5 {
    public static void main(String[] args) {
        Restaurant();
    }
    public static void Restaurant(){
        Scanner input = new Scanner(System.in);
        String vegetarian, vegan, gluten;
        System.out.print("Is anyone in your party a vegetarian?");
        vegetarian = input.nextLine();

        System.out.print("Is anyone in your party a vegan?");
        vegan = input.nextLine();

        System.out.print("Is anyone in your party a gluten-free?");
        gluten = input.nextLine();
        System.out.println("Here are your restaurant choices:");

        if (vegetarian.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("yes")) {
            System.out.print("\tCorner Cafe\n");
            System.out.print("\tThe Chef's Kitchen\n");
        } else if (vegan.equalsIgnoreCase("yes") && gluten.equalsIgnoreCase("yes")) {
            System.out.print("\tCorner Cafe\n");
            System.out.print("\tThe Chef's Kitchen\n");
        } else if (gluten.equalsIgnoreCase("yes") && vegetarian.equalsIgnoreCase("yes")) {
            System.out.print("\tMain Street Pizza Company\n");
            System.out.print("\tCorner Cafe\n");
            System.out.print("\tThe Chef's Kitchen\n");
        } else if (gluten.equalsIgnoreCase("yes") && vegetarian.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("yes")) {
            System.out.print("\tCorner Cafe\n");
            System.out.print("\tThe Chef's Kitchen\n");
        } else if (gluten.equalsIgnoreCase("yes")) {
            System.out.print("\tMain Street Pizza Company\n");
            System.out.print("\tCorner Cafe\n");
            System.out.print("\tThe Chef's Kitchen\n");
        } else if (vegetarian.equalsIgnoreCase("yes")) {
            System.out.print("\tMain Street Pizza Company\n");
            System.out.print("\tCorner Cafe\n");
            System.out.print("\tThe Chef's Kitchen\n");
            System.out.print("\tMama's Fine Italian");
        } else if (vegan.equalsIgnoreCase("yes")) {
            System.out.print("\tCorner Cafe\n");
            System.out.print("\tThe Chef's Kitchen\n");
        }
        else{
            System.out.print("\tJoe's Gourmet Burgers\n") ;
            System.out.print("\tMain Street Pizza Company\n");
            System.out.print("\tCorner Cafe\n");
            System.out.print("\tThe Chef's Kitchen\n");
            System.out.print("\tMama's Fine Italian");
        }
    }
}
