/*

9. Reverse a String

Problem Name: Reverse String Recursively

Description:
Given a string, reverse it using recursion.

Example:

Input: "hello"
Output: "olleh"

*/

package Recursion;

public class reverseString {

    private static void printRev(String str,int len){
        if(len<0){
            return;
        }
        System.out.print(str.charAt(len));
        printRev(str,len-1);
    }
    private static void printReverse(String str){
        printRev(str,str.length()-1);
    }
    public static void main(String[] args) {
       printReverse("hello");
    }
}
