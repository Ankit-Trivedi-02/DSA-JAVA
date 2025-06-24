/* 

Question 1
 
Enter 3 numbers from the user & make a function to print their average.

 */

package Exercise_1;

import java.util.Scanner;

public class Average {
    public static int average(int n1, int n2, int n3) {
        return (n1 + n2 + n3) / 3;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter your number 2 : ");
        int n2 = sc.nextInt();
        System.out.print("Enter your number 3 : ");
        int n3 = sc.nextInt();
        System.out.println("Average of your number : " + average(n1, n2, n3));
    }

}
