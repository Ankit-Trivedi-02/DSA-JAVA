/*

Write a Java program to detect duplicate parentheses in a given expression.
A duplicate (or redundant) parenthesis occurs when an expression has unnecessary empty brackets such as:

"((a+b))" → duplicate
"(a+(b)/c)" → no duplicate
"(a)" → duplicate

The program should:

Read an expression as input.
Use a stack to check if any pair of parentheses is redundant.
If duplicate parentheses are found, print:
dublicate bracket

If the expression contains no duplicate brackets, print:

Perfect

*/

package Stack;

import java.util.Scanner;
import java.util.Stack;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        Stack<Character> ex = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            if (expression.charAt(i) != ')') {
                ex.push(expression.charAt(i));
            } else {
                if (ex.peek() == '(') {
                    System.out.println("dublicate bracket");
                    return;
                } else {
                    while (ex.peek() != '(') {
                        ex.pop();
                    }
                    ex.pop();
                }
            }
        }
        System.out.println("Perfect");
    }
}
