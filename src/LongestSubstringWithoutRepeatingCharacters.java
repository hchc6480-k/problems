public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        //String s = "abcabcbb";
        //String s = "pwwkew";
        String s = "au";

        int result = 0;
        int index = 0;
        while (index < s.length()) {
            String tmp = Character.toString(s.charAt(index));
            StringBuffer str = new StringBuffer();

            str.append(tmp);
            for (int i = index + 1; i < s.length(); i++) {
                if (str.indexOf(Character.toString(s.charAt(i))) < 0) {
                    str.append(s.charAt(i));
                } else {
                    break;
                }
            }
            if (result < str.length()) result = str.length();
            index++;
        }

        System.out.println("result:"+result);
    }
}
