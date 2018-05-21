package LinkedList;

/**
 * Created by wangxin on 2018/5/9.
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode cur=head;
        for(int i=2;i<10;i++){
            ListNode node=new ListNode(i);
            cur.next=node;
            cur=node;
        }
        head=reverse1(head);
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }

    }
    public static ListNode reverse1(ListNode head){
        if(head==null)
            return head;
        ListNode pre=head;
        ListNode cur=head.next;
        while (cur != null) {
            pre.next = cur.next;
            cur.next = head;
            head = cur;
            cur = pre.next;
        }
        return head;
    }
    public static ListNode reverse2(ListNode head){
        ListNode prev=null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

}
