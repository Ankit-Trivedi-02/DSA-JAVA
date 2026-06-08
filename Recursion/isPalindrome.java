/*

10. Check Palindrome

Problem Name: Recursive Palindrome Check

Description:
Given a string, determine whether it is a palindrome using recursion.

A palindrome reads the same forward and backward.

Example 1:

Input: "madam"
Output: true

Example 2:

Input: "hello"
Output: false

*/

package Recursion;

public class isPalindrome {

    private static boolean checkPalin(String str,int left, int right){
        if(left>right){
            return true;
        }
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        return checkPalin(str, left+1, right-1);
    }

    private static boolean check(String str){
        return checkPalin(str,0,str.length()-1);
    }
    public static void main(String[] args) {
        if(check("mom")){
            System.out.println("it is palin");
        }else{
            System.out.println("it is not palin");
        }
    }
}
