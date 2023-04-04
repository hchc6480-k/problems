import java.util.Stack;

public class ValidParentheses {
    /**
     * Stack : Last in first out
     * input : s = "()[]"
     * output : true
     * 한쌍이 순서에 맞게 일치해야 한다.
     */
    public static void main(String[] args) {
        String s = "()[]";
        //String s = "((("
        //String s = ")))";
        System.out.println("result:" + validParentheses(s));
    }

    public static boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cmp = s.charAt(i);
            char tmp = 'a';
            if (cmp == '(' || cmp == '[' || cmp == '{') {
                stack.push(cmp);
            } else {
                if (stack.isEmpty()) return false;
                else tmp = stack.pop();
            }

            if ((tmp == '(' && cmp != ')') || (tmp == '[' && cmp != ']') || (tmp == '{' && cmp != '}')) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
