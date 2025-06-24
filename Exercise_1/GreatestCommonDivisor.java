/*

Question 9

Write a function that calculates the Greatest Common Divisor of 2 numbers. 

*/

package Exercise_1;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int Hcf(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return n1 > n2 ? n1 : n2;
        }
        int divisor = 2;
        int value = 1;
        while (n1 != 1 && n2 != 1) {
            if (n1 % divisor == 0 && n2 % divisor == 0) {
                value *= divisor;
                n1 = n1 / divisor;
                n2 = n2 / divisor;
            } else if (n1 % divisor == 0) {
                n1 = n1 / divisor;
            } else if (n2 % divisor == 0) {
                n2 = n2 / divisor;
            } else {
                divisor++;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int n2 = sc.nextInt();
        System.out.println("HCF will be : " + Hcf(n1, n2));
    }
}
