package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreater3rd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        int l = sc.nextInt();
        int[] array = new int[l];
        int[] answer = new int[l];

        for (int i = 0; i < l; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < l; i++) {
            int y = i;
            while (!st.isEmpty() && st.peek() < array[i]) {
                // System.out.print(i + " : is current iteration : While is running and going to pop  : " + st.peek()
                //         + " cause " + array[i] + " is greater");
                st.pop();
                y = y - 1;
                answer[y] = array[i];
            }
            st.push(array[i]);
        }
        if (!st.isEmpty()) {
            for (int i = 0; i < l; i++) {
                if (answer[i] == 0) {
                    answer[i] = -1;
                    // st.pop();
                }
            }
        }
        for (int i = 0; i < l; i++) {
            System.out.print(answer[i]+" ");
        }
        sc.close();
    }

}
