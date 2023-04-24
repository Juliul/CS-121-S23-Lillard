package AssignWeek5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
public class Assignment9_FileReadingAndWriting {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile1 = new File ("C:/Users/Coura/OneDrive/Desktop/courses.txt");
        try {
            Scanner input = new Scanner(inputFile1);
            String header = input.nextLine();
            System.out.println(header);
            while (input.hasNextLine()) {
                String course = input.next();
                int credits = Integer.parseInt(input.next());
                int score = Integer.parseInt(input.next());
                System.out.printf("%-7s %3d %7d\n",course,credits,score);
            }
            input.close();
        } catch(FileNotFoundException e) {
            System.err.println("File  not found.");
        }
    }
}
class FileOutput {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("mycourses.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String course, credits, score;
        output.printf("%s %s %s\n", "course", "credits", "score");
        for (int i = 1; i <= 3; i++) {
            course = JOptionPane.showInputDialog(String.format("Enter name of course %d", i));
            credits = JOptionPane.showInputDialog("Enter the course credits");
            score = JOptionPane.showInputDialog("Enter the course score");
            output.printf("%s %s %s\n", course, credits, score);
        }
        output.close();
    }
}
class FileAppend {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("mycourses.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);

            String course = JOptionPane.showInputDialog("Enter course name");
            String credits = JOptionPane.showInputDialog("Enter course credits");
            String score = JOptionPane.showInputDialog("Enter course score");

            output.printf("%s %s %s", course, credits, score);
            fileWriter.close();
            output.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }
}


