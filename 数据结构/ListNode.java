public class ListNode {
 public int val;
 public ListNode node;
 public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
    }

    public ListNode(int val, ListNode node, ListNode next) {
        this.val = val;
        this.node = node;
        this.next = next;
    }

    public ListNode(ListNode node, ListNode next) {
        this.node = node;
        this.next = next;
    }
}
