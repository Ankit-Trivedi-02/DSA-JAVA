/*

3. Sum of First N Natural Numbers

Problem Name: Sum of N Numbers

Description:
Given an integer N, find the sum of the first N natural numbers using recursion.

Example:

Input: 5
Output: 15

Explanation:

1 + 2 + 3 + 4 + 5 = 15

*/

package Recursion;

public class sumOfN {
    private static int sum(int num) {

        if (num == 1) {
            return 1;
        }
        return num + sum(num-1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
