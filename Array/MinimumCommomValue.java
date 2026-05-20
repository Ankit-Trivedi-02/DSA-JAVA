package Array;

public class MinimumCommomValue {
    public static int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        System.out.println(nums1.length + "    :    "+nums2.length);
        while (i < nums1.length-1 || j < nums2.length-1) {
            System.out.println("i  : " + i + "   " + "j  : " + j);
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }
            if(i < nums1.length-1) i++;
            if(j < nums2.length-1) j++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int[] arr2 = { 2, 4 };
        int res = getCommon(arr, arr2);
        System.out.println(res);
    }
}
