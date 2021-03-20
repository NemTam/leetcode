package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefixNoCommonPrefix() {
        String[] strs = {"alma", "korte", "barack"};
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefix() {
        String[] strs = {"sajt", "sajtosteszta", "salata"};
        assertEquals("sa", LongestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixAllTheSame() {
        String[] strs = {"alma", "alma", "alma"};
        assertEquals("alma", LongestCommonPrefix.longestCommonPrefix(strs));
    }

}