package Sorting;

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int[] nums = heights.clone();
        int n = nums.length;

        Arrays.sort(nums);
        
        int wrong = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=heights[i]){
                wrong++;
            }
        }
        
        return wrong;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3, 6, 7 };
        int res = heightChecker(arr);
        System.out.println(res);
    }
}
