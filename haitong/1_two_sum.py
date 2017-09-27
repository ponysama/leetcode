class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        mem = dict()
        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in mem:
                return [mem[diff], i]
            mem[nums[i]] = i
