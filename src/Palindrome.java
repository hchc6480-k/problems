public class Palindrome {
    public static void main(String[] args) {
        /*Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.

        Input: x = -121
        Output: false

        Input: x = 10
        Output: false
        */

        int x = 123;
        System.out.println("result:" + isPalindrome(x));

    }

    public static boolean isPalindrome (int x) {
        if (x < 0) return false;
        else if (x == 0) return true;

        boolean tf = false;
        String compare = Integer.toString(x);
        StringBuffer test = new StringBuffer(compare);
        String reverse = test.reverse().toString();
        String test2 = reverse.substring(0, 1);

        if ("0".equals(test2)) tf =  false;
        else if (reverse.toString().equals(compare)) tf = true;

        return tf;
    }
}
