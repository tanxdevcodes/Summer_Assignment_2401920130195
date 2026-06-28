class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {

        // Step 1: Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode curr = slow;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare both halves
        ListNode dummy = head;

        while (prev != null) {
            if (dummy.val != prev.val) {
                return false;
            }
            dummy = dummy.next;
            prev = prev.next;
        }

        return true;
    }

    public static void main(String[] args) {

        // 1 -> 2 -> 2 -> 1
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(1);

        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println(isPalindrome(a));
    }
}