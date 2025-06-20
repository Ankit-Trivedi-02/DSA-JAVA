/* Pattern 5
 
To draw a diamond

   *
  ***
 *****
*******
*******
 *****
  ***
   *
   

 */

package Advance_Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int r = 4;

        // upper half
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
