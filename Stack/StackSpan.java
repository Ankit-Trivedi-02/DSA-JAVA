/*

Question Stock Span Problem

You are given an array of integers where each element represents the price of a stock on a given day.

The span of a stock’s price on a given day is defined as the maximum number of consecutive days just before the given day (including the current day) for which the price of the stock was less than or equal to its price on the given day.

Task

Write an algorithm to compute the span of stock prices for each day.

Input
An integer array prices[]

Output
An integer array span[] where span[i] is the stock span for day i

Example
Input:  {100, 80, 60, 70, 60, 75, 85}
Output: {1, 1, 1, 2, 1, 4, 6}

*/

package Stack;

import java.util.Stack;

public class StackSpan {
    public static void display(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }

    public static int[] findSpan(int[] args) {
        int[] result = new int[args.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < args.length; i++) {
            while (!stack.isEmpty() && args[stack.peek()] <= args[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] spanData = findSpan(array);
        display(spanData);
    }
}
