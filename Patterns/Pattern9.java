/*

Try to draw 0 1 triangle

1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1

Hint : find a pattern odd and even [Matrix]

 */

package Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int r = 5;
        int num = 1;
        for (int i = 1; i <= r; i++) {
            if (i % 2 != 0)
                num = 1;
            else
                num = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
                if (num == 2)
                    num = 0;

            }
            System.out.println();
        }
    }

}
