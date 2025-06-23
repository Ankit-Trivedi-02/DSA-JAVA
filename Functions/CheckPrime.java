/*
 
Make a function to check if a number is prime or not.

*/

package Functions;

import java.util.Scanner;

public class CheckPrime {
    public static boolean checkPrime(int n) {
        int count = 0;
        for (int i = 2; (i * i) <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n1 = sc.nextInt();
        System.out.println(checkPrime(n1) ? "Number is prime " : "Number is not prime");
    }
}