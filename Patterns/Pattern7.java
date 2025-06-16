/*

Try to draw inverted half prymaid with numbers

12345
1234
123
12
1


 */

 package Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int r = 5;
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
