package Week2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Activity1
{
    //Use Dialog Box for the first task, Scanner for the second one
    public static void main(String[] args)
    {
        String name; name = JOptionPane.showInputDialog("Enter your name.");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        StringBuilder reversedName = new StringBuilder(name);
        System.out.println(reversedName.reverse());
        number();
        //return reverseName;

        // calling the number method

    }
    public static void number()
    {
        int num, num2;

        Scanner keyboard = new Scanner(System.in);
        //Get the first number
        System.out.print("Please enter your first number: ");
        num = keyboard.nextInt();
        //Get the second number
        System.out.print("Please enter your second number: ");
        num2 = keyboard.nextInt();
        int Add = num+num2;
        int Subtract = num-num2;
        int Divide = num/num2;
        double SqRoot = Math.sqrt(num);
        double SqRoot2 = Math.sqrt(num2);
        double Power = Math.pow(num,num2);
        double Log = Math.log(num);
        double Log2 = Math.log(num2);
        System.out.print("The addition of these numbers is: ");
        System.out.println(Add);
        System.out.print("The subtraction of these numbers is: ");
        System.out.println(Subtract);
        System.out.print("The division of these numbers is: ");
        System.out.println(Divide);
        System.out.print("The Square Root of the first number is: ");
        System.out.println(SqRoot);
        System.out.print("The Square Root of the second number is: ");
        System.out.println(SqRoot2);
        System.out.print("The first number to the power of the second number is: ");
        System.out.println(Power);
        System.out.print("The logarithm of the first number is: ");
        System.out.println(Log);
        System.out.print("The logarithm of the second number is: ");
        System.out.println(Log2);

    }
}
