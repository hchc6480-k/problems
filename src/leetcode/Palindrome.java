package leetcode;

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
        StringBuffer str = new StringBuffer(compare);
        String reverse = str.reverse().toString();
        String str2 = reverse.substring(0, 1);

        if ("0".equals(str2)) tf =  false;
        else if (reverse.toString().equals(compare)) tf = true;

        return tf;
    }
}
