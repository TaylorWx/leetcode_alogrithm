package swordOffer;

/**
 * Created by wangxin on 2018/5/17.
 */
public class LinkStep {
    public static ListNode findNode(ListNode head,int step){
        //如何头指针为空
        if(head==null || step<=0)
            return null;
        ListNode node=head;
        ListNode pre=head;
        for(int i=0;i<step;i++){
            if(pre!=null)
                pre=pre.next;
            else
                return null;
        }
        while(pre!=null){
            pre=pre.next;
            node=node.next;
        }
        return node;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode cur=head;
        for(int i=2;i<10;i++){
            ListNode node=new ListNode(i);
            cur.next=node;
            cur=node;
        }
        /*while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }*/
        //需要加一些判断
        System.out.println(findNode(head,9).val);
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}