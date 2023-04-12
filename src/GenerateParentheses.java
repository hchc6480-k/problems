import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    /**
     * DFS : 우선탐색
     *
     */
    static List<String> res = new ArrayList<>();
    public static void main(String[] args) {
        int n = 3;
        generateParenthesis(n, 1, 0, new StringBuffer("("));

        System.out.println(res);
    }

    public static void generateParenthesis(int n, int openCnt, int closeCnt, StringBuffer str) {
        if (openCnt == n && closeCnt == n) {
            res.add(str.toString());
            return;
        }

        if (openCnt < n) {
            str.append("(");
            generateParenthesis(n, openCnt + 1, closeCnt, str);
            str.setLength(str.length() - 1); // 상위 노드로 돌아가기 위한 처리
        }

        if (closeCnt < n && closeCnt < openCnt) {
            str.append(")");
            generateParenthesis(n, openCnt, closeCnt + 1, str);
            str.setLength(str.length() - 1);
        }

    }
}
