/*
 
WAP to find sum of two numbers by calling function 

*/

package Functions;

import java.util.Scanner;

public class AddTwoNumbers {
    public static int addTwoNumbers(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int n1=sc.nextInt();
        System.out.print("Enter number 1 : ");
        int n2=sc.nextInt();
        System.out.println(addTwoNumbers(n1, n2));
    }
}
