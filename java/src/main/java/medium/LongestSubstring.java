package medium;

import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int left_p = 0, right_p = 0;
        int max = 0;
        HashSet set = new HashSet();

        while (right_p < s.length()){
            if (!set.contains(s.charAt(right_p))) {
                set.add(s.charAt(right_p));
                max = Math.max(max, set.size());
                right_p++;
            } else {
                set.remove(s.charAt(left_p));
                left_p++;
            }
        }
        return max;
    }
}
