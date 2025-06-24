/*

Queaation 4 
 
Write a function that takes in the radius as input and returns the circumference of a circle.

 */

package Exercise_1;

import java.util.*;

public class CircumferanceOfCircle {
public static double circumferanceOfCircle(int r) {
        return (2*Math.PI*r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        int r = sc.nextInt();
        System.out.println("Circumferance of circle is : " + circumferanceOfCircle(r));
    }
}
