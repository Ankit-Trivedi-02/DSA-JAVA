/* Pattern 1 

To print a solid rectange

*****
*****
*****
*****

 */

package Patterns;
public class Pattern1 {
    public static void main(String[] args) {
        int r = 4;
        int c = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
