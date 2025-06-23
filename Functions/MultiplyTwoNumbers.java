/*
 
WAP to find product of two numbers by calling function 

 */

package Functions;

import java.util.Scanner;

public class MultiplyTwoNumbers {

    public static int multiplyTwoNumbers(int n1, int n2) {
        int product = n1 * n2;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int n1=sc.nextInt();
        System.out.print("Enter number 1 : ");
        int n2=sc.nextInt();
        System.out.println(multiplyTwoNumbers(n1, n2));
    }
}

