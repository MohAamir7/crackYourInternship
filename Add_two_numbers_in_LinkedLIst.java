package arsh_dsa_sheet;

public class Add_two_numbers_in_LinkedLIst {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode res = new ListNode(0);
	        ListNode temp = res;
	        int carry = 0;
	        // int sum = 0;
	        while(l1 != null || l2 != null){
	            int sum = 0 + carry;
	            if(l1 != null){
	                sum += l1.val;
	                l1 = l1.next;
	            }
	            if(l2 != null){
	                sum += l2.val;
	                l2 = l2.next;
	            }
	            carry = sum/10;
	            sum = sum%10;
	            temp.next = new ListNode(sum);
	            temp = temp.next;
	        }
	        if(carry == 1){
	            temp.next = new ListNode(1);
	            temp = temp.next;
	        }
	        return res.next;
	        
	    }

}
