package arsh_dsa_sheet;

public class Convert_Binary_Number_in_a_Linked_List_to_Integer {
	public int getDecimalValue(ListNode head) {
        int result = 0;
        while(head != null){
            result = result << 1;
            result += head.val;
            head = head.next;
        }
        return result;
        
    }

}
