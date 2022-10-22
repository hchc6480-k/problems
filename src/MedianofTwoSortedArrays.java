import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int num1[] = {1, 2};
        int num2[] = {3, 4};

        System.out.println("result:" + findMedianSortedArrays(num1, num2));
    }

    public static double findMedianSortedArrays (int num1[], int num2[]) {
        double result = 0;
        int tmp[] = new int[num1.length + num2.length];

        for (int i = 0; i < tmp.length; i++) {
            if (i < num1.length) {
                tmp[i] = num1[i];
            } else {
                tmp[i] = num2[i - num1.length];
            }
        }
        // 정렬
        Arrays.sort(tmp);
        int median = tmp.length / 2;
        if (tmp.length % 2 == 1) {
            result = tmp[median - 1];
        } else {
            // int형식으로 계산되기 때문에 double로 캐스팅
            result = (double)(tmp[median] + tmp[median - 1]) / 2;
        }

        return result;
    }
}
