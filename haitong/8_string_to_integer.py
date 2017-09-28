class Solution(object):
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        res, sign, INT_MAX, INT_MIN = 0, 1, 2147483647, -2147483648
        l = str.split()
        if not l:
            return 0
        s = l[0]
        if s[0] == '-':
            sign = -1
        elif s[0] != '+' and (s[0] > '9' or s[0] < '0'):
            return 0
        for i, c in enumerate(s):
            if i == 0 and s[i] in ('+', '-'):
                continue
            if c > '9' or c < '0':
                return res * sign
            if sign == 1 and INT_MAX - res * 10 < int(c):
                return INT_MAX
            if sign == -1 and INT_MIN + res * 10 > -int(c):
                return INT_MIN
            res = res * 10 + int(c)
        return res * sign
