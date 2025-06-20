/* Pattern 1
   
To create this butterfly pattern

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

 */

package Advance_Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int r = 4;


        // upper part
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (r - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part
        for (int i = r; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(r - i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
