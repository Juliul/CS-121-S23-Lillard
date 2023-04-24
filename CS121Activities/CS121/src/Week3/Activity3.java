package Week3;
import javax.swing.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class Activity3 {
    public static void main(String[] args) {
        Login();
        EvenOrOdd();
        Triangle();
    }
    public static void EvenOrOdd(){
        int num;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number");
        num = Integer.parseInt(keyboard.nextLine());

        if (num%2 == 0) {
            System.out.println("This number is Even");

        } else {
            System.out.println("This number is odd");
        }
    }

    public static void Login() {
        String userName, passWord, name, pw;
        userName = "Julius";
        passWord = "Bossanova";
        name = JOptionPane.showInputDialog("Enter your Username");
        pw = JOptionPane.showInputDialog("Enter your Password");
        if (name.equals(userName) && pw.equals(passWord)) {
            System.out.println("Welcome to CS121!");
        } else if (name.equals(userName) && pw != passWord) {
            System.out.println("Sorry, your password is incorrect.");
        } else if (name != userName && pw.equals(passWord)) {
            System.out.println("Sorry, your username is incorrect.");
        } else if (name != userName && pw != passWord) {
            System.out.println("Sorry, both your username and password is incorrect.");
        }
    }
    public static void Triangle(){
        int side1, side2, side3;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle");
        side1 = Integer.parseInt(keyboard.nextLine());
        System.out.println("Enter the second side of the triangle");
        side2 = Integer.parseInt(keyboard.nextLine());
        System.out.println("Enter the third side of the triangle");
        side3 = Integer.parseInt(keyboard.nextLine());
        //Scalene triangle: All sides have different lengths.
        //Isosceles triangle: Two sides have the same length.
        //Equilateral triangle: All sides are equal.
        if (side1 == side2 && side2 == side3){
            System.out.println("This is an Equilateral Triangle");
        } else if (side1 != side2 && side2 != side3){
            System.out.println("This is a Scalene Triangle");
        } else  {
            System.out.println("This is an Isosceles");
        }
    }
}
