package AssignWeek4;
import java.util.Random;
public class Assignment8_RandomNumbers {
    public static void main(String[] args) {
        double randomDouble = Math.random() * 50 + 1;

        int randomInt = (int)(Math.random() * 50 + 1);

        System.out.printf("%.2f\n", randomDouble);
        System.out.printf("%d\n", randomInt);
    }
    public static void main2(String[] ags) {
        Random random = new Random();
        int randomInt = random.nextInt(50);
        double randomDouble = random.nextDouble() * 50;

        System.out.printf("random int: %d\n", randomInt);
        System.out.printf("random double: %.2f", randomDouble);
    }
}