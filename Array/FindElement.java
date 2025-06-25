/*

take an array as input from the user
Search for a given number x and print the index at which it occurs

*/
package Array;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Subjects : ");
        int l = sc.nextInt();
        int[] marks = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.print("Enter your marks : ");
            marks[i] = sc.nextInt();
        }
        System.out.print("Enter the marks you want to find position : ");
        int toFind = sc.nextInt();

        for (int i = 0; i < l; i++) {
            if (marks[i] == toFind) {
                System.out.print("Found at Index : " + i + " Position : " + (i + 1));
                break;
            }
        }
    }
}
