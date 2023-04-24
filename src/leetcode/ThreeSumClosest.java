package leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        /**
         * Input: nums = [-1,2,1,-4], target = 1
         * Output: 2
         * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
         */

        /**
         * Input: nums = [4,0,5,-5,3,3,0,-4,-5]
         * Output: -2
         */

        int nums[] = {-4,-2,-1,0,3};
        int target = 1;
        Arrays.sort(nums);

        int left = 0;
        int right = 0;
        int tmp = Integer.MAX_VALUE;
        int sum = 0;
        int result = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            left = i + 1;
            right = nums.length - 1;

            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - sum) < tmp) {
                    tmp = Math.abs(target - sum);
                    result = sum;
                }

                if (target > sum) left++;
                else right--;
            }
        }

        System.out.println("result:"+result);

    }
}
