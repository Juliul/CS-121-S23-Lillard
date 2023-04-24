package AssignWeek3;
import java.util.Scanner;
public class Assignment4_Equals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mcu = "Marvel Cinematic Universe";
        String dceu = "DC Extended Universe";
        String winner;

        System.out.println("Batman vs Captain America: Who would win?");
        winner = scanner.nextLine();
        System.out.println();

        if (winner.equals("Batman")) {
            System.out.printf("%s wins this one.\n", dceu);
        } else if (winner.equals("Captain America")) {
            System.out.printf("%s wins this one.\n", mcu);
        } else {
            System.out.println("Not an option");
        }
    }
}
