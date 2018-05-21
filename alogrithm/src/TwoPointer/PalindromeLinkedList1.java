package TwoPointer;

/**
 * Created by wangxin on 2018/5/9.
 */
public class PalindromeLinkedList1 {
    public static boolean isPalindrome(ListNode head){
        //如果链表为空或者仅有一个元素那么肯定是回文链表
        if (head != null|| head.next != null) {
            return true;
        }
        //快慢指针法，寻找链表中心
        ListNode  slow, fast;
        slow = fast = head;
        while (fast!=null&& fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast!=null) {
            //链表元素奇数个
            slow.next = reverseList(slow.next);
            slow = slow.next;
        }else{
            //链表元素偶数个
            slow = reverseList(slow);
        }
        while (slow !=null) {
            if (head.val != slow.val) {
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }
    public static ListNode reverseList(ListNode head){
        if(head == null)
            return head;
        ListNode pre=head;
        ListNode cur=head.next;
        while(cur!=null){
            pre.next=cur.next;
            cur.next=head;
            head=cur;
            cur=head.next;
        }
        return head;
    }

    public static void main(String[] args) {

    }

}
