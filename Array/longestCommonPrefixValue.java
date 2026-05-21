/*

LeetCode 3043. Find the Length of the Longest Common Prefix  

*/

package Array;

import java.util.HashSet;

public class longestCommonPrefixValue {

    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
         HashSet<String> prefixes = new HashSet<>();
        int lcp = 0;
        // Filled hash with all possible prefixes of num1 each number
        for(int num : arr1){
            String s = String.valueOf(num);
            StringBuilder prefix = new StringBuilder();
            for(char ch : s.toCharArray()){
                prefix.append(ch);
                prefixes.add(prefix.toString());
            }
        }

        //Now we only need to match each prefixes of nums2 in hashSet
        for(int num : arr2){
            String s = String.valueOf(num);
            StringBuilder prefix = new StringBuilder();
            for(char ch : s.toCharArray()){
                prefix.append(ch);
                if(prefixes.contains(prefix.toString())){
                    lcp = Math.max(lcp,prefix.length());
                }
            }
        }

        return lcp;
    }
    public static void main(String[] args) {
        int[] num1 = { 1, 10, 100 };
        int[] num2 = { 1000 };
        System.out.println(longestCommonPrefix(num1, num2));
    }
}
