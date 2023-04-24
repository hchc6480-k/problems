package leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        /*
        * Input: height = [1,8,6,2,5,4,8,3,7]
        * Output: 49
        *
        * Input : height = [2,3,4,5,18,17,6]
        * output : 17
        * */

        //int[] height = {1,8,6,2,5,4,8,3,7};
        //int[] height = {1,1};
        int[] height = {2,3,4,5,18,17,6};
        System.out.println("result:" + maxArea(height));
    }

    public static int maxArea (int[] height) {
        int startWidth = 0;
        int endWidth = height.length - 1;
        int area = 0;

        // while문으로 양끝에서 동시 비교하며 순회하는 것이 제일빠르다.
        while (endWidth - startWidth > 0) {
            int waterHeight = Math.min(height[endWidth], height[startWidth]);
            area = Math.max(area, (endWidth - startWidth) * waterHeight);
            if (height[endWidth] > height[startWidth]) {
                startWidth++;
            } else {
                endWidth--;
            }
        }
        /* 시간 초과 case
        int waterWidth = 0;
        int waterHeight = 0;
        int result = 0;

        for (int i = 0; i < height.length; i++) {
          for (int j = 1; j < height.length; j++) {
             waterWidth = j - i;
             waterHeight = Math.min(height[i], height[j]);
             if (result < waterWidth * waterHeight) result = waterWidth * waterHeight;
           }
         }
        }*/

        return area;
    }
}
