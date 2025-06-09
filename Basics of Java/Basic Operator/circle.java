import java.util.*;

public class circle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        int radius = sc.nextInt();

        double circumferance = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Radius of circle is : " + radius);
        System.out.println("Circumferance of circle is : " + circumferance);
        System.out.println("Area of circle is : " + area);
    }
}
