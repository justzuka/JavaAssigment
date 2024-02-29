class ListNode {
    public int value;
    public ListNode next;
    ListNode(int v){
        value = v;
        next = null;
    }
}

public class Test3 {
    public static void VisualizeLinkedList(ListNode head){
        ListNode temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public static ListNode reverseList(ListNode head){
        ListNode temp = head;
        ListNode holder = null;
        ListNode cur = null;
        while (temp != null){
            cur = temp;
            temp = temp.next;
            cur.next = holder;
            holder = cur;
        }
        return holder;
    }
    public static void main(String[] args) {
        // Problem description does not say anything about changing linked list, so I am going to
        // reverse current list.

        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println("normal list");
        VisualizeLinkedList(head);


        System.out.println("reversed list");
        VisualizeLinkedList(reverseList(head));


    }
}
