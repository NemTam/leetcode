from typing import List
from collections import Counter


def findMedianSortedArrays(nums1: List[int], nums2: List[int]) -> float:
    sorted_list = sorted(nums1 + nums2)
    if len(sorted_list) % 2 == 1:
        return sorted_list[int(len(sorted_list) / 2)]
    else:
        return (sorted_list[int(len(sorted_list) / 2) - 1] + sorted_list[int(len(sorted_list) / 2)]) / 2


l1 = [1, 3]
l2 = [2]

# print(findMedianSortedArrays(l1, l2))
print(findMedianSortedArrays([0, 1], [2, 3]))
