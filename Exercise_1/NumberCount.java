/*

Question 7
 
Write a program to enter the numbers till the user wants 
and at the end it should display the count of positive, negative and zeros entered. 

 */

package Exercise_1;

import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 to give input \n0 to stop : ");
        int input = 1;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int num;
        do {
            System.out.print("Enter your number : ");
            num = sc.nextInt();
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
            System.out.print("Want to give more input : ");
            input = sc.nextInt();
        } while (input != 0);

        System.out.println("Number of Positive inputs : " + positiveCount
                + "\nNumber of negative inputs : " + negativeCount
                + "\nNumber of zero input : " + zeroCount);

    }
}
