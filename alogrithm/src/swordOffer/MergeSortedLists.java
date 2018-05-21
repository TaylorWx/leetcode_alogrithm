package swordOffer;

/**
 * Created by wangxin on 2018/5/17.
 */
public class MergeSortedLists {
    public static ListNode mergeList(ListNode head1,ListNode head2){
        if(head1==null&&head2==null)
            return null;
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
        ListNode head=new ListNode(-1);
        ListNode pre=head;
        while(head1!=null && head2!=null){
            if(head1.val <=head2.val){
                pre.next=head1;
                head1=head1.next;
            }else{
                pre.next=head2;
                head2=head2.next;
            }
            pre=pre.next;
        }
        if(head1!=null){
            pre.next=head1;
        }
        if(head2!=null)
            pre.next=head2;
        return head.next;
    }
    public static void main(String[] args) {
        ListNode head1=new ListNode(1);
        ListNode pre1=head1;
        for(int i=2;i<10;i++){
            ListNode cur=new ListNode(i);
            pre1.next=cur;
            pre1=cur;
        }
        ListNode head2=new ListNode(1);
        ListNode pre2=head2;
        for(int i=2;i<10;i++){
            ListNode cur=new ListNode(i);
            pre2.next=cur;
            pre2=cur;
        }
        ListNode head=mergeList(head1,head2);
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}
