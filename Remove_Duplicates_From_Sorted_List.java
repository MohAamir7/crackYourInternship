package arsh_dsa_sheet;

public class Remove_Duplicates_From_Sorted_List {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if(temp == null){
            return head;
        }
         while(temp.next != null){
             if(temp.val == temp.next.val){
                 temp.next = temp.next.next;
             }else{
                 temp = temp.next;
             }
         }
         return head;
        
    }

}
