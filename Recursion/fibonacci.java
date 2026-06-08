/*

6. Fibonacci Number

Problem Name: Nth Fibonacci Number

Description:
Find the Nth Fibonacci number using recursion.

The Fibonacci sequence is:

0, 1, 1, 2, 3, 5, 8, ...

Example:

Input: 6
Output: 8

*/

package Recursion;

public class fibonacci {

    private static void fibona(int len, int prev, int next) {
        if (len == 0) {
            return;
        }
        System.out.print(prev + next+" ");
        fibona(len - 1, next, next + prev);

    }

    public static void main(String[] args) {
        int noOfElement = 7;
        System.out.print(0+" ");
        System.out.print(1+" ");

        fibona(noOfElement-2, 0, 1);

    }
}
