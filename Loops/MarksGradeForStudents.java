/*                        Question 
 Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
 */

package Loops;

import java.util.*;

public class MarksGradeForStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int totalSubjects = 0;
        int totalMarks = 0;
        System.out.print("1: if you want to give input \n0: To stop programm\n");
        do {
            System.out.print("Enter marks of student : ");
            int marks = sc.nextInt();
            totalSubjects++;
            totalMarks += marks;
            if (marks >= 90) {
                System.err.println("Marks : " + marks + " : This is Good");
            } else if (marks >= 60 || marks < 90) {
                System.out.println("Marks : " + marks + " : This is also Good");
            } else {
                System.out.println("Marks : " + marks + " : This is Good as well");
            }
            System.out.print("Enter your choice do you want to input marks : ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Total marks : " + totalMarks + " Overall Grade : " + (totalMarks / totalSubjects));
    }
}
