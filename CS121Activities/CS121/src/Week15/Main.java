package Week15;
import java.text.ParseException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ParseException {
        int calories;
        String startDate;
        String endDate;

        Scanner input = new Scanner(System.in);

        System.out.println("How many calories does the diet allow for?");
        calories = Integer.parseInt(input.nextLine());
        System.out.println("When do you start your diet? mm/dd/yyyy format");
        startDate = input.nextLine();
        System.out.println("When do you end your diet? mm/dd/yyyy format");
        endDate = input.nextLine();

        TotalCalories myObj = new TotalCalories(calories, startDate, endDate);
        System.out.println(myObj.getTotalCalories());
    }
}