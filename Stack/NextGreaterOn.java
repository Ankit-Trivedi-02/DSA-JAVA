/*

Write a Java program to find the Next Greater Element (NGE) for each element in an array using a stack.

You are given an integer N followed by N array elements.
For every element in the array, find the next element to its right that is greater than it.

If such an element exists → print that element.

If no greater element exists → print -1.

Finally, print the result for all elements separated by spaces.

Example:
Input:

5
4 5 2 25 7


Output:

5 25 25 -1 -1

*/

// This is secondary way to do which uses O(n) time complexity

package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterOn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        Stack<Integer> val = new Stack<>();

        int[] array = new int[l];
        int[] answer = new int[l];

        for (int i = 0; i < l; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = l - 1; i >= 0; i--) {

            while (!val.isEmpty() && val.peek() <= array[i]) {
                val.pop();
            }

            answer[i] = val.isEmpty() ? -1 : val.peek();
            val.push(array[i]);
        }

        for (int x : answer) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
