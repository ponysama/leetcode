class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        #brute force解
        #思路：把s中每个index都当做回文中心，朝两边试探最长回文
        #区分处理长度奇数和长度偶数的回文
        longest = ""
        for i, c in enumerate(s):
            r = self.longest_palindrome_radius(s, i, i)
            if 2 * r + 1 > len(longest):
                longest = s[i - r : i + r + 1]
            if i < len(s) - 1 and s[i] == s[i + 1]:
                r = self.longest_palindrome_radius(s, i, i + 1)
                if 2 * r + 2 > len(longest):
                    longest = s[i - r : i + r + 2]
        return longest
            
    #奇数则l_center == r_center, 偶数则 l_center == r_center - 1
    def longest_palindrome_radius(self, s, l_center, r_center):
        radius = 0
        while l_center >= radius and r_center + radius < len(s) \
        and s[l_center - radius] == s[r_center + radius]:
            radius += 1
        return radius - 1
                
