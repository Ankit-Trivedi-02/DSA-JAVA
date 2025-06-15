/*

To print a inverted triangle with 90° angle on left

****
***
**
*

 */

package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int r = 4;
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
