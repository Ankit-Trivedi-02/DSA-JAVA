/*

Question 10
 
Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

*/

package Exercise_1;

import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(int range) {
        int pre = 0;
        int next = 1;
        int fib;
        for (int i = 1; i <= range; i++) {
            System.out.print(pre + " ");
            fib = pre + next;
            pre = next;
            next = fib;
        }
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Range : ");
        int range = sc.nextInt();
        fibonacci(range);
    }

}
