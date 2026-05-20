/*

Take an array of numbers as input and visit and print every element.

*/

package Array;

import java.util.Scanner;

public class traversal {

    public static void print(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + "  ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter len of array : ");
        int len = sc.nextInt();
        int array[] = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }

        print(array);
    }
}
