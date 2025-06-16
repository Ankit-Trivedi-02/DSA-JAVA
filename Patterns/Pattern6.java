/*

Try to draw half prymaid with numbers

1
12
123
1234
12345


 */

package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int r = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
