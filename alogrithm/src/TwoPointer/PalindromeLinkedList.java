package TwoPointer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangxin on 2018/5/9.
 */
public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode first=head;
        List<Integer> list=new ArrayList<>();
        if(first==null||first.next==null)
            return true;
        while(first!=null){
            list.add(first.val);
            first=first.next;
        }
        for(int i=0;i<list.size()/2;i++){
            int a=list.get(i);
            int b=list.get(list.size()-i-1);
            if(!(a==b))
                return false;
        }
        return true;


    }

    public static void main(String[] args) {
        ListNode head=new ListNode(-129);
        ListNode cur=head;
        for(int i=1;i<2;i++){
            ListNode node=new ListNode(-129);
            cur.next=node;
            cur=node;
        }
        System.out.println(isPalindrome(head));
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
