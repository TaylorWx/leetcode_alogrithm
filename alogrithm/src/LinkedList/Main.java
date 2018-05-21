package LinkedList;

/**
 * Created by wangxin on 2018/4/25.
 */
public class Main {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode cur=head;
        for(int i=2;i<10;i++){
            ListNode node=new ListNode(i);
            cur.next=node;
            cur=node;
        }
        head=reverseList(head);
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
    public void deleteNode(ListNode node) {
        if(node!=null &&node.next!=null){
            node.val=node.next.val;
            node.next=node.next.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        if (head != null && head.next != null) {
            ListNode cur = head.next;
            ListNode pre = head;
            while (cur != null) {
                pre.next = cur.next;
                cur.next = head;
                head = cur;
                cur = pre.next;
            }
        }
        return head;
    }
}
