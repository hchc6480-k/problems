public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        // String s = "bbbbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("result:" + result);

    }

    public static int lengthOfLongestSubstring(String s) {
        String str = "";
        String tmp = "";
        String result = "";
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = tmp.indexOf(String.valueOf(s.charAt(i)));

            if (index != -1) {
                start = start + index + 1;
            }
            tmp = s.substring(start, i + 1);

            if (result.length() < tmp.length()) {
                result = tmp;
            }
        }
        return result.length();
    }
}
