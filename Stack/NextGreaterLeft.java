/*

WAP to find the closest greater number in left 

eg

input 
4 3 2 1

output
-1 4 3 2

for 4 no greater at left gives -1

*/
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        int[] array = new int[l];
        int[] ngl = new int[l];
        for (int i = 0; i < l; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < l; i++) {
            while (!stack.isEmpty() && array[i] >= stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ngl[i] = -1;
            } else {
                ngl[i] = stack.peek();
            }
            stack.push(array[i]);
        }

        for (int i = 0; i < l; i++) {
            System.out.print(ngl[i]+" ");
        }

        sc.close();
    }

}
