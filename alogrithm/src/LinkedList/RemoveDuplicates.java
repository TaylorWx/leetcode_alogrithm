package LinkedList;

/**
 * Created by wangxin on 2018/4/25.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        ListNode head1=new ListNode(2);
        ListNode cur1=head1;
        for(int i=2;i<10;i++){
            ListNode node=new ListNode(i);
            cur1.next=node;
            cur1=node;
        }

        ListNode head=deleteDuplicates(head1);
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println("***************");
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null ||head.next==null)
            return head;
        ListNode pre=head;
        ListNode cur=head.next;
        while(cur!=null){
            if(pre.val==cur.val){
                pre.next=cur.next;
                cur=pre.next;
            }else{
                pre=cur;
                cur=cur.next;
            }
        }
        return head;
    }
}
