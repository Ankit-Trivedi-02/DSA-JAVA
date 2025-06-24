/*

Question 2
 
Write a function to print the sum of all odd numbers from 1 to n.

 */

package Exercise_1;

import java.util.Scanner;

public class SumofNumbers {
    public static void sumofNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 to give input \n0 to stop : ");
        int input = 1;
        int sum = 0;
        int num;
        do {
            System.out.print("Enter number to find sum : ");
            num = sc.nextInt();
            System.out.print("Want to give more input : ");
            input = sc.nextInt();
            sum += num;
        } while (input != 0);

        System.out.println("sum of all numbers is : " + sum);
    }

    public static void main(String[] args) {
        sumofNumbers();
    }
}
