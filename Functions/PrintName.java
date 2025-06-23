/* 
 
WAP to print your name by calling function 

 */

package Functions;

import java.util.Scanner;

public class PrintName {
    public static void print(String name) {
        System.out.println("Your name is : " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        print(name);
    }

}
