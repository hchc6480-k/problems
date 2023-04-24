package leetcode;

public class LongestPalindromicSubstring {
    /**
     * Input: s = "babad"
     * Output: "bab"
     * Explanation: "aba" is also a valid answer.
     * */

    public static void main(String[] args) {
        //String s = "babad";
        //String s = "cbbd";
        //String s = "bb";
        //String s = "ccc";
        //String s = "aacabdkacaa";
        String s = "abcda";

        System.out.println("result:" + longestPalindrome(s));
    }

    public static String longestPalindrome (String s) {
        String output = "";
        int result = 0;

        if (s.length() == 1) return s;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    int compareLength = s.substring(i, j + 1).length();
                    if (compareLength > result) {
                        StringBuilder test = new StringBuilder(s.substring(i, j + 1));
                        if (test.reverse().toString().equals(s.substring(i, j + 1))) {
                            result =  compareLength;
                            output = s.substring(i, j + 1);
                        }
                    }
                }
            }
        }

        if ("".equals(output)) output = s.substring(0, 1);
        return output;
    }

}
