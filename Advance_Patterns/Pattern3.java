/*
to print this number space number 

    1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

 */

package Advance_Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int r = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
