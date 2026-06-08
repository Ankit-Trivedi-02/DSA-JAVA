/*

7. Count Digits in a Number

Problem Name: Count Digits Recursively

Description:
Given an integer N, count the number of digits using recursion.

Example:

Input: 12345
Output: 5

*/

package Recursion;

public class countDigits {
    private static int toCount(int num) {
        if(num==0){
            return 0;
        }
        return 1 + toCount(num/10);
    }
    public static void main(String[] args) {
        System.out.println(toCount(1111111111));
    }
}
