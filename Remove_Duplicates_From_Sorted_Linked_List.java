package arsh_dsa_sheet;

public class Remove_Duplicates_From_Sorted_Linked_List {
 public class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
		 
		class Solution {
		    public ListNode deleteDuplicates(ListNode head) {
		        if(head == null || head.next == null){
		            return head;
		        }
		        ListNode temp = new ListNode(0);
		        ListNode curr = head;
		        head = temp;

		        while(curr != null && curr.next != null){
		            if(curr.next != null && curr.next.val == curr.val){
		                while(curr.next != null && curr.next.val == curr.val){
		                    curr = curr.next;
		                }
		                // curr = curr.next;
		                temp.next = curr.next;
		                // temp = temp.next;
		            }else{
		                temp.next = curr;
		                // curr = curr.next;
		                temp = temp.next;

		            }
		            curr = curr.next;
		        }
		        return head.next;
		        
		    }
		}

}
