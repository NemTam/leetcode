from collections import Counter
from typing import List

nums = [-1, 0, 1, 2, -1, -4]

target = 0


def threeSum(nums: List[int]) -> List[List[int]]:
    c = Counter()
    cleaned_nums = []
    for elem in nums:
        if c[elem] > 2:
            pass
        else:
            cleaned_nums.append(elem)
            c[elem] += 1
    d = {}
    l = []
    for i, num in enumerate(cleaned_nums):
        target = - num
        d.clear()
        for j, num2 in enumerate(cleaned_nums):
            if i != j:
                if num2 in d:
                    l.append(sorted([num, num2, d[num2]]))
                else:
                    d[target - num2] = num2
    b_set = set(tuple(x) for x in l)
    return [list(x) for x in b_set]


s = threeSum(nums)
print(s)
