package LinkedList;

/**
 * Created by wangxin on 2018/4/25.
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode head1=new ListNode(1);
        ListNode cur1=head1;
        for(int i=2;i<10;i++){
            ListNode node=new ListNode(i);
            cur1.next=node;
            cur1=node;
        }
        /*while(head1!=null){
            System.out.print(head1.val+" ");
            head1=head1.next;
        }*/
        System.out.println("----------------");
        ListNode head2=new ListNode(1);
        ListNode cur2=head2;
        for(int i=2;i<11;i++){
            ListNode node=new ListNode(i);
            cur2.next=node;
            cur2=node;
        }
        /*while(head2!=null){
            System.out.print(head2.val+" ");
            head2=head2.next;
        }*/
        System.out.println("--------------------");
        ListNode head=mergeTwoLists(head1,head2);
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println("***************");
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node=new ListNode(0);
        ListNode pre=node;
        if(l1==null&&l2==null)
            return null;
        if(l1==null&&l2!=null)
            return l2;
        if(l1!=null&&l2==null)
            return l1;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                pre.next=l1;
                l1=l1.next;
            }else{
                pre.next=l2;
                l2=l2.next;
            }
            pre=pre.next;
        }
        if (l1 != null) {
            pre.next = l1;
        }
        if (l2 != null) {
            pre.next = l2;
        }
        return node.next;
    }
}
