/*

2. Print Numbers from N to 1

Problem Name: Print N to 1

Description:
Given a positive integer N, print all numbers from N down to 1 using recursion.

Example:

Input: 5
Output:
5
4
3
2
1

*/

package Recursion;

public class printOneToN {

    private static void print(int num) {

        if (num == 0) {
            System.out.println(num);
            return;
        }

        print(num - 1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        print(5);
    }
}
