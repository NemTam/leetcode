from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = {}
        for index, number in enumerate(nums):
            if number in d:
                return [nums.index(d[number]), index]
            else:
                d[target - number] = number


c = Solution()

nums = [3, 1, 3]
target = 6
print(c.twoSum(nums, target))
