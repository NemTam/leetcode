class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        carry = 0
        first = None
        last = None
        while l1 or l2 or carry:
            if l1 and l2:
                sum = l1.val + l2.val + carry
                l1 = l1.next
                l2 = l2.next
            elif l1:
                sum = l1.val + carry
                l1 = l1.next
            elif l2:
                sum = l2.val + carry
                l2 = l2.next
            elif carry:
                sum = carry
            carry = 0
            digits = [int(d) for d in str(sum)]
            if len(digits) > 1:
                sum = digits.pop()
                carry = digits.pop()
            if last:
                cur = ListNode(sum, None)
                last.next = cur
                last = cur
            else:
                last = ListNode(sum, None)
                first = last
        return first
    # Not mine
    def addTwoNumbersCleanSolution(self, l1, l2):
        carry = 0;
        res = n = ListNode(0);
        while l1 or l2 or carry:
            if l1:
                carry += l1.val
                l1 = l1.next;
            if l2:
                carry += l2.val;
                l2 = l2.next;
            carry, val = divmod(carry, 10)
            n.next = n = ListNode(val);
        return res.next;


# Test 1m
a3 = ListNode(3, None)
a2 = ListNode(1, a3)
a1 = ListNode(6, a2)

b4 = ListNode(9, None)
b3 = ListNode(1, b4)
b2 = ListNode(1, b3)
b1 = ListNode(5, b2)

# # Test 2 
# a1 = ListNode(0, None)
# b1 = ListNode(0, None)

c = Solution()

res = c.addTwoNumbers(a1, b1)
while res:
    print(res.val)
    res = res.next
