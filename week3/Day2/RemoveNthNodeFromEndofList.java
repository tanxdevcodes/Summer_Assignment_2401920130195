class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class RemoveNthNodeFromEndofList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        // fast ko n steps aage le jao
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // special case: head remove karna ho
        if (fast == null) {
            return head.next;
        }

        // dono pointers move karo
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // node delete
        slow.next = slow.next.next;

        return head;
    }

    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 4 -> 5
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        ListNode result = removeNthFromEnd(a, 2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}