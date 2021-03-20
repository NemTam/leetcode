# def longestPalindromeShittySolution(s: str) -> str:
#     if s[::-1] == s:
#         return s
#     else:
#         return max([longestPalindrome(s[1:]), longestPalindrome(s[:-1])], key=len)


class Solution(object):
    @staticmethod
    def longestPalindrome(s):
        """
        :type s: str
        :rtype: str
        """
        res = ""
        for i in range(len(s)):
            res = max(Solution.helper(s, i, i), Solution.helper(s, i, i + 1), res, key=len)

        return res

    @staticmethod
    def helper(s, l, r):
        while 0 <= l and r < len(s) and s[l] == s[r]:
            l -= 1
            r += 1
        return s[l + 1:r]


res = Solution.longestPalindrome("abbcccbbbcaaccbababcbcabca")
print(res)
