# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def reverseList_shitty_solution(head: ListNode) -> ListNode:
    arr = []
    while (head):
        arr.append(head.val)
        head = head.next
    if arr:
        first = ListNode(arr.pop())
        cur = first
        while (arr):
            cur.next = ListNode(arr.pop())
            cur = cur.next
        return first
    return head


def reverseList(head: ListNode) -> ListNode:
    prev = None
    cur = head
    while (cur):
        tempNext = cur.next
        cur.next = prev
        prev = cur
        cur = tempNext
    return prev


l3 = ListNode(3)
l2 = ListNode(2, l3)
l1 = ListNode(1, l2)

res = reverseList(l1)
print(res.val)
