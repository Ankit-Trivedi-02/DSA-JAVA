// A simple programm elaborating use of nested if or else if 

import java.util.*;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice \n1: hello\n2: konichiva\nany: yo whats up!");
        int input = sc.nextInt();

        if (input == 1) {
            System.out.println("hello");
        } else if (input == 2) {
            System.out.println("konichiva");
        } else {
            System.out.println("yo whats up!");
        }
    }
}
