package Week4;
import java.util.Scanner;
import java.util.Random;
public class Activity7 {
    public static void main(String[] args) {
        GuessingGame();
    }
    public static void GuessingGame(){
        int count = 0;
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt((100-1)+1);
        System.out.println("Guess a number between 1 and 100, or enter q if you want to quit.");
        // set up while loop to allow player to keep guessing
        while(true) {
            String input = keyboard.nextLine();
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Quitter! The number was "+answer+".");
                break;
            } else {
                // convert string to int
                int inputInt = Integer.parseInt(input);
                if (inputInt > 100 || inputInt < 1) {
                    System.out.println("This is an invalid number.");
                    count = count +1;
                } else if (inputInt < answer) {
                    System.out.println("Too low. Guess again:");
                    count = count + 1;
                } else if (inputInt > answer) {
                    System.out.println("Too High. Guess again:");
                    count = count + 1;
                } else {
                    System.out.println("Correct!\nNumber of guesses: " + count);
                }
            }
        }
    }
}

