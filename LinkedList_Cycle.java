package arsh_dsa_sheet;

public class LinkedList_Cycle {
	public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null ) return false;
        ListNode t1 = head;
        ListNode t2 = head;
        while(t2 != null){
            if(t1.next == null) return false;
            t1 = t1.next;
            if(t2.next == null) return false;
            t2 = t2.next.next;
            if(t2 == t1) return true;
        }
        return false;
        
    }

}
