class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if s:
            l = []
            for i in range(len(s)):
                stack = []
                for j in range(i, len(s)):
                    if s[j] not in stack:
                        stack.append(s[j])
                    else:
                        break
                l.append(len(stack))
            return max(l)
        else:
            return 0

    def lengthOfLongestSubstringSlidingWindow(self, s: str) -> int:
        l = [];
        m = 0
        for c in s:
            if c not in l:
                l.append(c)
                m = max(m, len(l))
            else:
                l = l[l.index(c) + 1:]
                l.append(c)
                m = max(m, len(l))
        return m


c = Solution()
res = c.lengthOfLongestSubstringSlidingWindow("aabbc")
print(res)
