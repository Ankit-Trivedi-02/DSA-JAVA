/* 

To print a triangle with 90° angle on left

*
**
***
**** 

*/

package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int r = 4;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
