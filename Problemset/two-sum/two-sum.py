
# @Title: 两数之和 (Two Sum)
# @Author: tongyaocheng@gmail.com
# @Date: 2020-02-26 01:33:25
# @Runtime: 32 ms
# @Memory: N/A

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hash_map = {}
        l = len(nums)
            
        for i in range(l):
            key = target - nums[i]
            if key in hash_map:
                return [hash_map[key],i]
            else:
                hash_map[nums[i]] = i
