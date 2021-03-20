package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListTest {

    @Test
    void mergeTwoLists() {
        ListNode a3 = new ListNode(5);
        ListNode a2 = new ListNode(2, a3);
        ListNode a1 = new ListNode(1, a2);
        ListNode b3 = new ListNode(4);
        ListNode b2 = new ListNode(3, b3);
        ListNode b1 = new ListNode(2, b2);

        ListNode res = MergeTwoSortedList.mergeTwoLists(a1, b1);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }
}