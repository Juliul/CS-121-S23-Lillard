package Week2;
import javax.swing.*;
public class Activity2 {
    public static void main(String[] args) {
        BookClubPoints();
        TestScores();
    }
    public static void BookClubPoints() {
        int numBooks = Integer.parseInt(JOptionPane.showInputDialog("How many books have you bought?"));
        // this statement looks at the enter number and displays the appropriate response
        if (numBooks == 0) {
            JOptionPane.showMessageDialog(null, "Sorry you earned 0 points");
        } else if (numBooks == 1) {
            JOptionPane.showMessageDialog(null, "You earned 5 points!");
        } else if (numBooks == 2) {
            JOptionPane.showMessageDialog(null, "You earned 15 points!");
        } else if (numBooks == 3) {
            JOptionPane.showMessageDialog(null, "You earned 30 points!");
        } else if (numBooks > 3) {
            JOptionPane.showMessageDialog(null, "You earned 60 points!");
        }
    }
    public static void TestScores() {
        String finalGrade = "A";
        // give instructions to user
        JOptionPane.showMessageDialog(null, "This program will accept three scores and then averages them for a final grade.");

        int score1 = Integer.parseInt(JOptionPane.showInputDialog("Score 1: "));
        int score2 = Integer.parseInt(JOptionPane.showInputDialog("Score 2: "));
        int score3 = Integer.parseInt(JOptionPane.showInputDialog("Score 3: "));

        int finalScore = score1 + score2 + score3;

        int average = finalScore / 3;

        if (average > 90) {
            finalGrade = "A";
        } else if (average > 80) {
            finalGrade = "B";
        } else if (average > 70) {
            finalGrade = "C";
        } else if (average > 60) {
            finalGrade = "D";
        } else if (average < 60) {
            finalGrade = "F";
        }

        JOptionPane.showMessageDialog(null, String.format("Your average test grade is " + average + ". Your final grade is " + finalGrade));

    }
}