class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        start, longest, mem = 0, 0, dict()
        for i in range(len(s)):
            if s[i] in mem and mem[s[i]] >= start:
                longest = max(longest, i - start)
                start = mem[s[i]] + 1
            mem[s[i]] = i
            
        return max(longest, len(s) - start)
