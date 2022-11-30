public class IntegerToRoman {
    public static void main(String[] args) {
        /**
         * Input: num = 58
         * Output: "LVIII"
         * Explanation: L = 50, V = 5, III = 3.
         */

        int num = 58;
        System.out.println("result:"+intToRoman(num));

    }

    public static String intToRoman(int num) {
        String symbol[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int value[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int index = 0;
        // 문자열 연산 시 StringBuffer가 메모리를 더 적게 먹음
        StringBuilder result = new StringBuilder();

        while (num > 0) {
            int tmp = num / value[index];
            if (tmp > 0) {
                num -= value[index] * tmp;
                for (int i = 0; i < tmp; i++){
                    result.append(symbol[index]);
                }
            } else {
                index++;
            }
        }

        return result.toString();
    }
}
