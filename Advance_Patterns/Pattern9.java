/* Pattern 9

To Print Pascal’s Triangle.
 

     1 
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1

 hint (Pascal(n,k) =  n! / k! * (n−k)!) where n=row , k=column/position and row starts from 0.
​
)
 */

package Advance_Patterns;

public class Pattern9 {

    public static int factorial(int num) {
        int fact = 1;
        if (num < 0) {
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int r = 5;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(factorial(i) / (factorial(j) * (factorial((i - j)))) + " ");
            }
            System.out.println();
        }
    }
}
