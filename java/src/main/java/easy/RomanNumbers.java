package easy;

import java.util.HashMap;

public class RomanNumbers {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        int i = 0;
        for (; i < s.length() - 1; i++) {
            int currentDigit = map.get(s.charAt(i));
            int nextDigit = map.get(s.charAt(i + 1));
            if (currentDigit < nextDigit) {
                sum += nextDigit - currentDigit;
                i++;
            } else {
                sum += currentDigit;
            }
        }
        if (s.length() > i) {
            sum += map.get(s.charAt(i));
        }
        return sum;
    }
}
