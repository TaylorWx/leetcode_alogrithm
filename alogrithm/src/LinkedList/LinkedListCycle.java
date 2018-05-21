package LinkedList;

/**
 * Created by wangxin on 2018/4/25.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        boolean falg=false;
        if(head==null)
            return false;
        if(head.next==head)
            return true;
        ListNode worker=head;
        ListNode runner=head;
        while(runner.next!=null&&runner.next.next!=null){
            worker=worker.next;
            runner=runner.next.next;
            if(worker==runner){
                falg=true;
                break;
            }
        }
        return falg;
    }
}
