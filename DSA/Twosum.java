package DSA;

import java.util.Arrays;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        TwoSum obj = new TwoSum();
        int[] result = obj.twoSum(nums, target);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
