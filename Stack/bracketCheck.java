/*

Write a Java program to check whether an expression contains balanced brackets.
The expression may include the following types of brackets:

()
{}
[]

The program should read an expression as input and determine whether every opening bracket has a corresponding closing bracket in the correct order.
If all brackets are balanced, print:
All Brackets Balanced

Otherwise, print:

No — Something wrong

*/


package Stack;

import java.util.Scanner;
import java.util.Stack;

public class bracketCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // For closing brackets, check for matching pair
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    System.out.println("No — Something wrong");
                    return;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    System.out.println("No — Something wrong");
                    return;
                }
            }
        }

        // Final check
        if (stack.isEmpty()) {
            System.out.println("All Brackets Balanced");
        } else {
            System.out.println("No — Something wrong");
        }
    }
}
