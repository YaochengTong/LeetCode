
# @Title: 两数之和 (Two Sum)
# @Author: tongyaocheng@gmail.com
# @Date: 2020-02-26 01:13:26
# @Runtime: 52 ms
# @Memory: N/A

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hash = {}
        for i in range(len(nums)):
            hash[nums[i]] = i
        for i in range(len(nums)):
            if target-nums[i] in hash:
                if hash[target-nums[i]] != i:
                    return [i, hash[target-nums[i]]]    
