package easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {
    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack();
        HashMap<Character, Character> map = new HashMap();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (map.containsKey(currentChar)) {
                stack.push(map.get(currentChar));
            } else if (map.containsValue(currentChar)) {
                char expectedChar;
                if (!stack.isEmpty()) {
                    expectedChar = stack.pop();
                } else {
                    return false;
                }
                if (expectedChar != currentChar) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
