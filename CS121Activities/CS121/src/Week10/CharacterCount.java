package Week10;
import java.util.Scanner;
public class CharacterCount {
    public static void main(String args[]) {
        String str;
        int i, len;
        int counter[] = new int[256];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        str = scanner.nextLine();
        len = str.length();
        for (i = 0; i < len; i++) {
            counter[(int) str.charAt(i)]++;
        }
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " --> " + counter[i]);
            }
        }
    }
}

