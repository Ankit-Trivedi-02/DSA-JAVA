/*

1. Print Numbers from 1 to N

Problem Name: Print 1 to N

Description:
Given a positive integer N, print all numbers from 1 to N using recursion.

Example:

Input: 5
Output:
1
2
3
4
5

*/

package Recursion;

public class printNToOne {

    private static void print(int num) {

        if (num == 0) {
            System.out.println(num);
            return;
        }

        System.out.println(num);
        print(num - 1);
    }

    public static void main(String[] args) {
        print(5);
    }

}
