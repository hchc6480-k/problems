package leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("result:" + longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix (String[] strs) {
        if (strs.length <= 0) return "";
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int index = 0;
            while ((index < prefix.length() && index < strs[i].length()) && prefix.charAt(index) == strs[i].charAt(index)) {
                index++;
            }
            prefix=prefix.substring(0, index);
        }
        if (prefix.length() > 0) return prefix;
        else return "";
    }
}
