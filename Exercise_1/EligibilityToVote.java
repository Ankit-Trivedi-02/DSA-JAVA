/*
 
Question 5

Write a function that takes in age as input and returns if that person is eligible to vote or not. 
A person of age > 18 is eligible to vote.


*/

package Exercise_1;

import java.util.Scanner;

public class EligibilityToVote {
    public static boolean eligibilityToVote(int age) {
        return (age > 18 ? true : false);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Is Eligibal to vote : " + eligibilityToVote(age));
    }
}