/* Question
 Print all even numbers till n.
 */

package Loops;

import java.util.*;

public class EvenNumberTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your n'th number : ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
