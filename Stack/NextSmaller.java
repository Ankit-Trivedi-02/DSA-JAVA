package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        int[] array = new int[l];

        // nsr next smaller left
        int[] nsl = new int[l];

        for (int i = 0; i < l; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < l; i++) {

            while (!stack.isEmpty() && stack.peek() >= array[i]) {
                stack.pop();
            }
            nsl[i] = stack.isEmpty()?-1:stack.peek();
            stack.push(array[i]);
        }

        System.out.println("------ New Out put -------");
        for (int i = 0; i < l; i++) {
            System.out.print(nsl[i] + " ");
        }

        sc.close();
    }

}
