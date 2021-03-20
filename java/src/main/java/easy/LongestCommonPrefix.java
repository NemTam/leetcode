package easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Optional<String> min = Arrays.stream(strs).min(Comparator.comparingInt(String::length));
        if (min.isPresent()) {
            StringBuilder commonPrefix = new StringBuilder();
            for (int i = 0; i < min.get().length(); i++) {
                Character local_char = min.get().charAt(i);
                for (int j = 0; j < strs.length; j++) {
                    if (strs[j].charAt(i) != local_char) {
                        // Itt return lesz majd
                        return commonPrefix.toString();
                    }
                }
                commonPrefix.append(local_char);
            }
            System.out.println(commonPrefix);
            return commonPrefix.toString();
        } else {
            return "";
        }
    }
}
