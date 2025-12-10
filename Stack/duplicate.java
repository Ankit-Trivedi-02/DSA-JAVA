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
