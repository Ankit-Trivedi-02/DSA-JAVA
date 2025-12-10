package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        Stack<Integer> val = new Stack<>();

        int[] array = new int[l];

        for (int i = 0; i < l; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (array[i] < array[j]) {
                    val.push(array[j]);
                    break;
                }
            }
            if (val.size() != i + 1) {
                val.push(-1);
            }
        }

        int[] newArray = new int[l];

        for (int i = l-1; i >=0; i--) {
            newArray[i] = val.pop();
        }

        for (int i = 0; i < l; i++) {
            System.out.print(newArray[i]+" ");
        }

    }
}
