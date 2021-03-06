package second;

import org.junit.jupiter.api.Test;

public class NodeTest {

    @Test
    void firstTest() {
        ListNode n1 = new ListNode();
        System.out.println(n1.val);
        System.out.println(n1.next);
    }

    @Test
    void addTwoNumbers1() {
        ListNode a1 = new ListNode(2);
        ListNode b1 = new ListNode(5);
        ListNode res = AddTwoNumbers.addTwoNumbers(a1, b1);
        assert res.val == 7;
        assert res.next == null;
    }

    @Test
    void addTwoNumbers2() {
        ListNode a1 = new ListNode(9);
        ListNode b1 = new ListNode(5);
        ListNode res = AddTwoNumbers.addTwoNumbers(a1, b1);

        assert res.val == 4;
        res = res.next;
        assert res.val == 1;
    }

    @Test
    void addTwoNumbers3() {
        ListNode a2 = new ListNode(2);
        ListNode a1 = new ListNode(9, a2);
        ListNode b1 = new ListNode(5);
        ListNode res = AddTwoNumbers.addTwoNumbers(a1, b1);

        assert res.val == 4;
        res = res.next;
        assert res.val == 3;
    }

    @Test
    void addTwoNumbers4() {
        ListNode a3 = new ListNode(2);
        ListNode a2 = new ListNode(2, a3);
        ListNode a1 = new ListNode(9, a2);
        ListNode b1 = new ListNode(5);
        ListNode res = AddTwoNumbers.addTwoNumbers(a1, b1);

        assert res.val == 4;
        res = res.next;
        assert res.val == 3;
        res = res.next;
        assert res.val == 2;
    }

    @Test
    void addTwoNumbers5() {
        ListNode a3 = new ListNode(3);
        ListNode a2 = new ListNode(4, a3);
        ListNode a1 = new ListNode(2, a2);
        ListNode b3 = new ListNode(4);
        ListNode b2 = new ListNode(6, b3);
        ListNode b1 = new ListNode(5, b2);
        ListNode res = AddTwoNumbers.addTwoNumbers(a1, b1);

        assert res.val == 7;
        res = res.next;
        assert res.val == 0;
        res = res.next;
        assert res.val == 8;
    }
}
