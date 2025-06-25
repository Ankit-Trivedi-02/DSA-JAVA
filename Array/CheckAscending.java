/*


Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.



*/

package Array;

import java.util.Scanner;

public class CheckAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int l = sc.nextInt();
        boolean isAcending = true;
        int[] array = new int[l];

        for (int i = 0; i < l; i++) {
            System.out.print("Enter your number : ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < l - 1; i++) {
            if (array[i] > array[i + 1]) {
                isAcending = false;
                break;
            }
        }
        if (isAcending) {
            System.out.println("Array is arranged in ascending order !");
        } else {
            System.out.println("Array is not arranged in ascending order !");
        }
    }

}
