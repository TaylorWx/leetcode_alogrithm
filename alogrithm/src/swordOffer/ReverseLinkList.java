package swordOffer;

/**
 * Created by wangxin on 2018/5/17.
 */
public class ReverseLinkList {
    public static ListNode reverse(ListNode head){
        if(head==null||head.next==null)
            return head;
        ListNode pre=head;
        ListNode cur=head.next;
        while(cur!=null){
            pre.next=cur.next;
            cur.next=head;
            head=cur;
            cur=pre.next;
        }
        return head;
    }

    /**
     * 递归实现反转链表，返回翻转后的头结点
     * @param pPre
     * @param pCur
     * @return
     */
    public static ListNode ReverseListRecursivly(ListNode pPre,ListNode pCur) {
        if(pCur == null)
            return null;
        if(pCur.next == null) {
            pCur.next = pPre;
            return pCur;
        }
        ListNode pNext = pCur.next;
        pCur.next = pPre;
        ListNode pNewHead = ReverseListRecursivly(pCur,pNext);
        return pNewHead;
    }

    public static ListNode ReverseList2(ListNode pHead) {
        return ReverseListRecursivly(null,pHead);
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode pre=head;
        for(int i=2;i<10;i++){
            ListNode cur=new ListNode(i);
            pre.next=cur;
            pre=cur;
        }
        head=reverse(head);
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }

}
