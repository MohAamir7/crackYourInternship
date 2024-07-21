package arsh_dsa_sheet;

public class Merge_Two_Sorted_List {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list2.next, list1);
                return list2;
            }
        }
        return list1 == null ? list2 : list1;
        
    }

}
