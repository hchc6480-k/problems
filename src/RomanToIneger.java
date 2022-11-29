import java.util.Arrays;

public class RomanToIneger {
    public static void main(String[] args) {
        /**
         * Input: s = "LVIII"
         * Output: 58
         * Explanation: L = 50, V= 5, III = 3.
         */
        String s = "LVIII";

        System.out.println("result:"+romanToInt(s));
    }

    public static int romanToInt(String s) {
        String symbol[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String value[] = {"1000", "900", "500", "400", "100", "90", "50", "40", "10", "9", "5", "4", "1"};
        int firstIndex = 0;
        int result = 0;
        int tmp = 0;

        while (s.length() > firstIndex) {
            if (firstIndex + 2 <= s.length() && Arrays.asList(symbol).contains(s.substring(firstIndex, firstIndex + 2))) {
                tmp = Arrays.asList(symbol).indexOf(s.substring(firstIndex, firstIndex + 2));
                result += Integer.parseInt(value[tmp]);
                firstIndex +=2;
            } else {
                tmp = firstIndex + 1 < s.length() ? Arrays.asList(symbol).indexOf(s.substring(firstIndex, firstIndex + 1)) : Arrays.asList(symbol).indexOf(s.substring(firstIndex));
                result += Integer.parseInt(value[tmp]);
                firstIndex += 1;
            }
        }
        return result;
    }
}
