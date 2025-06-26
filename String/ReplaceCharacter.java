/*


Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”


*/

package String;

import java.util.Scanner;

public class ReplaceCharacter {
    public static String replaceChar(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e') {
                newString += 'i';
            } else {
                newString += s.charAt(i);
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your text : ");
        String text = sc.nextLine();

        System.out.println("Original text : " + text);
        System.out.println("New text : " + replaceChar(text));

    }
}
