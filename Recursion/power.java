/*

5. Power of a Number

Problem Name: Calculate X^N

Description:
Given two integers x and n, compute x^n using recursion.

Example:

Input:
x = 2
n = 4

Output:
16

*/

package Recursion;

public class power {

    private static int findPower(int num, int pow) {
        if(pow==0){
            return 1;
        }
        return num * findPower(num,pow-1);
    }
    public static void main(String[] args) {
        System.out.println(findPower(50, 3));
    }

}
