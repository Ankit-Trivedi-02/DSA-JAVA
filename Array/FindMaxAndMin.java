/*

Find the maximum & minimum number in an array of integers.


*/

package Array;

import java.util.Scanner;

public class FindMaxAndMin {
    public static int Max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int Min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int l = sc.nextInt();

        int[] array = new int[l];

        for (int i = 0; i < l; i++) {
            System.out.print("Enter your number : ");
            array[i] = sc.nextInt();
        }
        System.out.println("Maximum value in array is : " + Max(array));
        System.out.println("Minimum value in array is : " + Min(array));
    }

}
