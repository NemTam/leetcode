# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def reverseList(head: ListNode) -> ListNode:
    arr = []
    while (head):
        arr.append(head.val)
        head = head.next

    first = ListNode(arr.pop())
    cur = first
    while (arr):
        cur.next = ListNode(arr.pop())
        cur = cur.next
    return first


l3 = ListNode(3)
l2 = ListNode(2, l3)
l1 = ListNode(1, l2)

res = reverseList(l1)
