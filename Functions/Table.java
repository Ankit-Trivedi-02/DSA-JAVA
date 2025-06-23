/*
 
Make a function to print the table of a given number n.

*/

package Functions;

import java.util.Scanner;

public class Table {
    public static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n1 = sc.nextInt();
        table(n1);
    }
}
