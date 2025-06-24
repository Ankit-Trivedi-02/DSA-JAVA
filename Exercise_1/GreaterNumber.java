/*

Question 3

Write a function which takes in 2 numbers and returns the greater of those two.

 */

package Exercise_1;

import java.util.Scanner;

public class GreaterNumber {
    public static int greaterNumber(int n1, int n2) {
        return (n1 > n2 ? n1 : n2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int n2 = sc.nextInt();
        System.out.println("Bigger number is : " + greaterNumber(n1, n2));
    }
}
