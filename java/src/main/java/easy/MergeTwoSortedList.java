package easy;

import java.util.List;

public class MergeTwoSortedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode resultNode = new ListNode();
        ListNode startNode = resultNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                resultNode.val = l1.val;
                l1 = l1.next;
            } else {
                resultNode.val = l2.val;
                l2 = l2.next;
            }
            resultNode.next = new ListNode();
            resultNode = resultNode.next;
        }
        if (l1 != null) {
            resultNode.val = l1.val;
            resultNode.next = l1.next;
        } else {
            resultNode.val = l2.val;
            resultNode.next = l2.next;
        }
        return startNode;
    }
}
