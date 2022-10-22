import java.math.BigDecimal;

public class ReverseInteger {
    /**
     * Input: x = 123
     * Output: 321
     *
     * Input: x = -123
     * Output: -321
     */
    public static void main(String[] args) {
        int x = -123;
        System.out.println("result:" + reverse(x));
    }

    public static int reverse (int x) {
        StringBuffer s = new StringBuffer(Integer.toString(x));

        if (x == 0) {
            return x;
        }

        StringBuffer reverse = new StringBuffer();
        if (s.toString().contains("-")) {
            reverse.append("-");
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if ('-' == (s.charAt(i))) {
                break;
            }
            reverse.append(s.charAt(i));
        }

        long cmp = new BigDecimal(reverse.toString()).longValue();
        if (cmp > Integer.MAX_VALUE || cmp < Integer.MIN_VALUE) {
            return 0;
        }

        return (int)cmp;
    }
}
