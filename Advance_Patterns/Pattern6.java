/* Patter 6
  
To create this hollow butterfly pattern

*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *


 */


package Advance_Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int r = 5;

        // upper part
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1 || j == r)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (r - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1 || j == r)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        //lower half

        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1 || j == r)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (r - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1 || j == r)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
