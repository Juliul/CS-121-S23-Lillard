package Week13;
import java.util.Stack;
import java.util.*;
public class BalancedBrackets {
    static boolean BalancedBrackets(String test) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < test.length(); i++) {
            char c = test.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            if (stack.empty())
                return false;
            char check;
            switch (c) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (stack.empty());
    }
}
