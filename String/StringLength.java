/*


Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.


*/

package String;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        int length = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names : ");
        int l = sc.nextInt();
        sc.nextLine();
        String[] names = new String[l];

        for (int i = 0; i < l; i++) {
            System.out.print("Enter name of student : ");
            names[i] = sc.nextLine();
            length += names[i].length();
        }
        System.out.println("Length of all names is : " + length);
    }

}
