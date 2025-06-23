/*
 
WAP to find factorial of a number by calling function 

 */


package Functions;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if(n<0){
            return 0;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n1 = sc.nextInt();
        System.out.println(factorial(n1));
    }
}
