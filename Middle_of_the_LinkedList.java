package arsh_dsa_sheet;
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Middle_of_the_LinkedList {
	public ListNode middleNode(ListNode head) {
        ListNode t1 = head;
        ListNode t2 = head;
        while(t2 != null && t2.next != null){
            t1 = t1.next;
            t2 = t2.next.next;
        }
        return t1;
        
    }

}
