package Week5;
import javax.swing.*;
import java.io.*;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
public class Activity10 {
    public static void main(String[] args) throws IOException {
        FileRead();
        FileWrite();
        FileAppend();
    }
    public static void FileRead(){
        // make file  object
        File inputFile = new File("course.txt");
        // make scanner object
        try {
            //make scanner object read file
            Scanner input = new Scanner(inputFile);

            //read and print header
            String header = input.nextLine();
            System.out.println(header);

            // read values and print values
            while(input.hasNextLine()){
                String course = input.next();
                int credits = Integer.parseInt(input.next());
                int score = Integer.parseInt(input.next());
                System.out.printf("%-7s %3d d%7d\n", course, credits, score);

            }
            input.close();
        }catch(FileNotFoundException e) {
            System.out.println("File Not Found!");
        }


    }
    public static void FileWrite() throws FileNotFoundException {
        File outputFile = new File("mycourses.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String course;
        String credits;
        String score;

        output.printf("%s %s %s\n", "course", "credits", "score");

        for (int i=1; i <= 3; i++){
            course = JOptionPane.showInputDialog(String.format("Enter name of course %d", i));
            credits = JOptionPane.showInputDialog("Enter the course credit");
            score = JOptionPane.showInputDialog("Enter the course score");

            output.printf("%s %s %s\n", course, credits,score);
        }
        output.close();
    }
    public static void FileAppend() throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("mycourses.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);

            String course = JOptionPane.showInputDialog("Enter course name");
            String credits = JOptionPane.showInputDialog("Enter course credits");
            String score = JOptionPane.showInputDialog("Enter course score");

            output.printf("%s %s %s", course, credits, score);
            fileWriter.close();
            output.close();
        }catch(FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
        }
    }
}
