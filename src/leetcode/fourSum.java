package leetcode;

import java.util.*;

public class fourSum {
    /**
     * Input: nums = [1,0,-1,0,-2,2], target = 0
     * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
     **
     */
    public static void main(String[] args) {
        HashSet<List<Integer>> result = new HashSet<>(); // 중복 제거를 위해 HashSet<E> 사용
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        Arrays.sort(nums);

        for (int first = 0; first < nums.length - 3; first++) {
            if (target < 0 && nums[first] >=0) {
                break;
            }
            for(int second = first + 1; second < nums.length - 2; second++) {
                int third = second + 1;
                int fourth = nums.length -1;

                while (third < fourth) {
                    int sum =  nums[first] + nums[second] + nums[third] + nums[fourth];
                    System.out.println(first+","+second+","+third+","+fourth+",sum:"+sum);
                    if (sum == target) {
                        result.add(Arrays.asList(nums[first], nums[second], nums[third], nums[fourth]));
                        third++;
                        fourth--;
                    } else if (sum > target) {
                        fourth--;
                    } else {
                        third++;
                    }
                }
            }
        }

        List<List<Integer>> answer = new ArrayList<>(result); // List로 변환
        System.out.println("answer:" + answer);
    }
}
