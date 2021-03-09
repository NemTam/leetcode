package third;

import org.junit.jupiter.api.Test;

public class LongestSubstringTest {
    @Test
    void first() {
        int res = LongestSubstring.lengthOfLongestSubstring("aabbabc");
        assert res == 3;
    }
    @Test
    void second() {
        int res = LongestSubstring.lengthOfLongestSubstring("aabb");
        assert res == 2;
    }
    @Test
    void third() {
        int res = LongestSubstring.lengthOfLongestSubstring("aaaaa");
        assert res == 1;
    }
    @Test
    void fourth() {
        int res = LongestSubstring.lengthOfLongestSubstring("aabbabc");
        assert res == 3;
    }
}
