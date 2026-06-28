class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class MergeTwoSortedList {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        // List 1: 1 -> 3 -> 5
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(5);
        a.next = b;
        b.next = c;

        // List 2: 2 -> 4 -> 6
        ListNode x = new ListNode(2);
        ListNode y = new ListNode(4);
        ListNode z = new ListNode(6);
        x.next = y;
        y.next = z;

        ListNode result = mergeTwoLists(a, x);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
