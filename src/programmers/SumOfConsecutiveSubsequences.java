package programmers;

import java.util.ArrayList;
import java.util.List;

public class SumOfConsecutiveSubsequences {
    public static void main(String[] args) {
        /*int[] sequence = {1,2,3,4,5};
        int k = 7;*/
        /*int[] sequence = {1, 1, 1, 2, 3, 4, 5};
        int k = 5;*/
        int[] sequence = {2,2,2,2,2};
        int k = 6;
        List<Integer> list = new ArrayList<>();

        int left = 0;
        int right = 0;
        int size = sequence.length;
        int sum = sequence[0];
        while (true){
            System.out.println(left+","+right+","+size+","+sum);
            // 현재 부분 수열의 합과 k가 일치하는 left와 right를 저장함
            if(sum == k && size > right - left){
                list = new ArrayList<>();
                list.add(left);
                list.add(right);
                size = right - left;
            }
            if(left == sequence.length - 1 && right == sequence.length - 1) break;

            if(sum <= k && right < sequence.length - 1){
                right++;
                // 새로운 원소가 추가되었으므로, right에 위치하는 값을 부분 수열 합에 더함
                if(right < sequence.length - 1) sum += sequence[right];
            } else {
                // 기존의 left의 위치한 원소를 부분 수열의 합에서 제외
                if(left < sequence.length - 1) sum -= sequence[left];
                left++;
            }
        }

        System.out.println(list);
        System.out.println(new int[]{list.get(0),list.get(1)});

    }
}
