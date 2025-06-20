
/*

Try to draw palindrome

    1
   212
  32123
 4321234
543212345

 */

package Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        int r = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 2; j--) {
                System.out.print(j);
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
