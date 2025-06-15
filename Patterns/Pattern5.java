/*
 
To print a triangle with 90° angle on right

   *
  **
 ***
****

 */

package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int r = 4;
        int sp = (r - 1);

        for (int i = 1; i <= r; i++) {
            for (int space = 1; space <= sp; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            sp--;
        }

    }
}
