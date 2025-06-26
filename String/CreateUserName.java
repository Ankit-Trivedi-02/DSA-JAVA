/*


Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”



*/

package String;

import java.util.Scanner;

public class CreateUserName {
    public static String emailToUserName(String email) {
        int index = email.length();
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                index = i;
                break;
            }
        }
        String userName = email.substring(0, index);
        return userName;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your e-mail : ");
        String email = sc.nextLine();
        System.out.println("Hello " + emailToUserName(email));
    }

}
