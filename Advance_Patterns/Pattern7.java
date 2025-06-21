/* Pattern 7

to draw this hollow rhombus 

    *****
   *   *
  *   *
 *   *
*****

 */

package Advance_Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int r = 5;
        for (int i = 1; i <= r; i++) {

            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= r; j++) {
                if(i==1||i==r||j==1||j==r)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
