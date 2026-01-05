package Stack;

import java.util.Scanner;
import java.util.Stack;

public class FilterZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                stack.push(array[i]);
            }
        }

        int[] newArray = new int[length];

        for (int i = 0; i < length; i++) {
            int data = !stack.isEmpty() ? stack.pop() : 0;
            newArray[i] = data;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(newArray[i] + " ");
        }

        sc.close();
    }
}
