import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String s = "[{]}";
        System.out.println(balancedParenthesesValidationChecker(s));

    }

    public static boolean balancedParenthesesValidationChecker(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');                                  //solution 1
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
        /*Map<Character, Character> brackets = new HashMap<>();
        brackets.put(']', '[');
        brackets.put(')', '(');
        brackets.put('}', '{');
        Stack<Character> characters = new Stack<>();
        for (Character ch : str.toCharArray()) {
            if (!brackets.containsKey(ch)) {
                characters.add(ch);
            } else {
                char top = characters.isEmpty() ? '?' : characters.pop();     // solution 2

                if (top != brackets.get(ch)) {
                    return false;
                }
            }
        }
        return characters.isEmpty();
    }*/
