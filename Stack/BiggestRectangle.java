package Stack;

import java.util.Stack;

public class BiggestRectangle {

    public static void display(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static int[] nextSmallerLeft(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] nsl = new int[nums.length];
        nsl[0] = -1;
        stack.push(0);

        for (int i = 1; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] <= nums[stack.peek()]) {
                stack.pop();
            }
            nsl[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        return nsl;
    }

    public static int[] nextSmallerRight(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] nsr = new int[nums.length];
        nsr[nsr.length - 1] = nsr.length;
        stack.push(nsr.length - 1);

        for (int i = nums.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] <= nums[stack.peek()]) {
                stack.pop();
            }
            nsr[i] = stack.isEmpty() ? 6 : stack.peek();
            stack.push(i);
        }

        return nsr;
    }

    public static int largestRectangle(int[] nums) {

        int[] nsr = nextSmallerRight(nums);
        int[] nsl = nextSmallerLeft(nums);
        int high = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] * (nsr[i] - nsl[i] - 1) > high) {
                high = nums[i] * (nsr[i] - nsl[i] - 1);
            }
        }
        return high;

    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 4, 4, 4, 4 };
        display(nums);
        System.out.println();
        display(nextSmallerRight(nums));
        System.out.println();
        display(nextSmallerLeft(nums));
        System.out.println();
        System.out.println(largestRectangle(nums));

    }

}
