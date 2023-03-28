import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsofaPhoneNumber {

    /**
     * dfs(깊이 우선순위 탐색) 차례대로 노드 탐색 후 더이상 갈수 없을시 가장 가까운 노드로 돌아와 재 탐색
     * 재귀함수로 구현
     * a -> ad
     * a -> adg
     * a -> adh
     * a -> adi
     * a -> ab
     * .....
     */

    Map<String, String> map = new HashMap<>();
    List<String> result = new ArrayList<>();
    int size = 0;

    public static void main(String[] args) {
        LetterCombinationsofaPhoneNumber s = new LetterCombinationsofaPhoneNumber();
        System.out.println(s.letterCombinations("23"));
    }

    public String letterCombinations(String digits) {
        size = digits.length();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        if (size == 0) {
            return "";
        }

        dfs(digits, "");
        return result.toString();

    }

    public void dfs(String digits, String words) {
        if (size == words.length()) {
            result.add(words); // 만들어진 문자열 add
            return;
        }

        String target = map.get(String.valueOf(digits.charAt(0)));

        for (int i = 0; i < target.length(); i++) {
            dfs(digits.substring(1), words + target.charAt(i));
        }
    }
}
