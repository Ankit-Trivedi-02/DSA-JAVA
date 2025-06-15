/* Question 
To Check and Print if a number is prime or not (Input n from the user).  */

package Loops;

import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; (i * i) <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }
}
