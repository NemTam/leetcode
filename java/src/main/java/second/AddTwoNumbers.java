package second;

import java.util.List;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode firstNode = new ListNode(0);
        ListNode lastNode = firstNode;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (carry != 0) {
                sum += carry;
                carry = 0;
            }
            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;

            }
            lastNode.val = sum;
            lastNode.next = new ListNode();
            lastNode = lastNode.next;

            System.out.println(sum);
        }
        return firstNode;
    }

}
