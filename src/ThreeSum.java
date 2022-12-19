import java.util.*;

/**
 * 퀵정렬
 * 배열 정리후 하나의 값을 가지고 나머지와 차례로 비교한다.
 */

public class ThreeSum {
    public static void main(String[] args) {
        /**
         * Input: nums = [-1,0,1,2,-1,-4]
         * Output: [[-1,-1,2],[-1,0,1]]
         * Explanation:
         * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
         * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
         * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
         *
         * Input : [0,0,0,0]
         * Output : [[0,0,0]]
         *
         * Input : [-2,0,1,1,2]
         * Output : [[-2,0,2],[-2,1,1]]
         */
        //int nums[] = {-1,0,1,2,-1,-4};
        //int nums[] = {-2,0,1,1,2};
        int nums[] = {-2,0,0,2,2};
        System.out.println("result:"+threeSum(nums));
    }

    public static List<List<Integer>> threeSum (int nums[]) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (nums[left] == nums[left - 1] && left < right) left++;
                    while (nums[right] == nums[right + 1] && left < right) right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return new ArrayList<>(result);
    }



}
