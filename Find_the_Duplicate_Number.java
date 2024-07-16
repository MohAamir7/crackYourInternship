package arsh_dsa_sheet;

public class Find_the_Duplicate_Number {
	 public int findDuplicate(int[] nums) {
	        int slow = nums[0];
	        int fast = nums[0];

	        // Move slow and fast pointers until they meet
	        do {
	            slow = nums[slow];
	            fast = nums[nums[fast]];
	        } while (slow != fast);

	        // Reset one pointer to the first element
	        slow = nums[0];

	        // Move both pointers until they meet again
	        while (slow != fast) {
	            slow = nums[slow];
	            fast = nums[fast];
	        }

	        // Return the meeting point, which is the repeated number
	        return slow;

	        
	    }

}
