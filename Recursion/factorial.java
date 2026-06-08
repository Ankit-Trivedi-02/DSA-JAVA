/*

4. Factorial of a Number

Problem Name: Recursive Factorial

Description:
Find the factorial of a given number N using recursion.

Example:

Input: 5
Output: 120

Explanation:

5! = 5 × 4 × 3 × 2 × 1

*/



package Recursion;

public class factorial {
    private static int findFactorial(int num) {
        if(num == 1 || num == 0){
            return 1;
        }
        return num * findFactorial(num-1);
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(0));
    }
}
