package Week4;
import java.util.Random;
import java.util.Scanner;
public class Activity9 {
    public static void main(String[] args) {
        ESPGame();
    }
    public static void ESPGame(){
        //initialize variable
        String color = null;
        int points = 0;
        int counter = 1;
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        while (counter <= 10) {
            int colorSet = random.nextInt(5);
            if (colorSet == 0) {
                color = "red";
            }
            if (colorSet == 1) {
                color = "green";
            }
            if (colorSet == 2) {
                color = "blue";
            }
            if (colorSet == 3) {
                color = "orange";
            }
            if (colorSet == 4) {
                color = "yellow";
            }
            System.out.println(counter+". What color has the computer chosen?");
            String userGuess = input.nextLine();
            // If the user guesses correctly
            if (color.equalsIgnoreCase(userGuess)){
                System.out.println(">The computer chose "+ color);
                points = points + 1;
                counter = counter + 1;
            } else {
                System.out.println(">The computer chose "+ color);
                counter = counter + 1;
            }
        }
        System.out.println("You got " + points + " out of 10 correct");
    }
}

