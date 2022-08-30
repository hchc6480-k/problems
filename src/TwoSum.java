/**
 * 배열 안에 있는 정수의 두 인덱스의 합이 target과 일치하는 인덱스를 찾아라.
 */
public class TwoSum {
    public static void main(String[] args) {
        //int[] nums = {2,7,11,15};
        //int target = 9;
        int[] nums = {3,2,4};
        int target = 6;

        int[] result = twoSum(nums, target);

        System.out.println(result[0] + "," + result[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && (target - nums[i] - nums[j]) == 0) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{0,0};
    }

    /* best caes
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> t = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (t.containsKey(nums[i])) {
                return new int[]{t.get(nums[i]),i};
            } else {
                t.put(target-nums[i], i);
            }
        }

        return new int[]{0,0};
    }
    */
}

