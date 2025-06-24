/*
 
Question 8

Two numbers are entered by the user, x and n. 
Write a function to find the value of one number raised to the power of another i.e. xn.

*/
package Exercise_1;

import java.util.Scanner;

public class ToFindPower {
    public static int power(int num, int pow) {
        int value = 1;
        for(int i=1;i<=pow;i++){
            value*=num;
        }
        return value;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        System.out.print("Enter your power : ");
        int pow = sc.nextInt();
        System.out.println(num+" raised to power "+ pow +" = " +power(num, pow));
    }
}
