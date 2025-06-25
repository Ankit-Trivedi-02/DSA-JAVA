/*


Take an array of names as input from the user and print them on the screen.


*/

package Array;

import java.util.Scanner;

public class NamesPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int l = sc.nextInt();
        sc.nextLine(); // this is written to store \n released by the upper sc.nextInt(); refer Chatgpt
        String[] names = new String[l];

        for (int i = 0; i < l; i++) {
            System.out.print("Enter name of student " + (i + 1) + " : ");
            names[i]=sc.nextLine();
        }

        for (int i = 0; i < l; i++) {
            System.out.println("Name of student " + (i + 1) + " : " +names[i]);
        }

    }
}
