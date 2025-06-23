/*
 
Make a function to check if a given number n is even or not.

*/

package Functions;

import java.util.Scanner;

public class CheckEvenOdd {
    public static boolean checkPrime(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n1 = sc.nextInt();
        System.out.println(checkPrime(n1) ? "Number is even " : "Number is odd");
    }
}