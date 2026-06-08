/*

8. Sum of Digits

Problem Name: Sum of Digits

Description:
Given a number N, find the sum of all its digits using recursion.

Example:

Input: 1234
Output: 10

Explanation:

1 + 2 + 3 + 4 = 10

*/

package Recursion;

public class sumOfDigits {

    private static int sum(int num) {
        if(num<10){
            return num;
        }
        return num%10 + sum(num/10);
    }

    public static void main(String[] args) {
        System.out.println(sum(7811111));
    }
    
}
