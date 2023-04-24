package Week13;

import java.util.Scanner;
import static Week13.BalancedBrackets.BalancedBrackets;
public class BalancedBracketsTester {
    public static void main(String[] args){
        BalancedBrackets balanced = new BalancedBrackets();
        Scanner input = new Scanner(System.in);

        String test;
        System.out.println("Please enter any set of brackets");
        test = input.nextLine();
       if (BalancedBrackets(test)){
            System.out.println("Balanced");
        }else{
            System.out.println("Unbalanced");
        }
    }
}
