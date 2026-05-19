package Array;

public class MinimumCommomValue {
    public static int getCommon(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            if (isMatch(num, nums2)) {
                System.out.println("I am being used");
                return num;
            }
        }
        return -1;
    }

    public static boolean isMatch(int target, int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
              int mid = left + (right - left) / 2;
            System.out.println(mid + "  " + target);
            if (nums[mid] == target)
                return true;

            if (mid < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int[] arr2 = { 2, 4 };
        int res = getCommon(arr, arr2);
        System.out.println(res);
    }
}
