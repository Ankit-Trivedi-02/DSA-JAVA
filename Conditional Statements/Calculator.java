/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.*/

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number 2 : ");
        int num2 = sc.nextInt();
        System.out.print(
                "1 : addition\n2 : substraction\n3 : multiplication\n4 : division\n5 : remainder\nEnter your choice : 1");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
                break;
            case 2:
                System.out.println(+num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            case 5:
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                break;

            default:
                System.out.println("Invalid Input !");
        }
    }
}