package arsh_dsa_sheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top_K_frequent_Element {
	class Solution {
	    public int[] topKFrequent(int[] nums, int k) {
	        Map<Integer, Integer> map = new HashMap<>();
	        int[] ans = new int[k];

	        for (int i = 0; i < nums.length; i++) {
	            int count = 0;
	            if (map.containsKey(nums[i])) {
	                count = map.get(nums[i]);
	            }
	            map.put(nums[i], count + 1);
	        }
	        List<Integer> list = new ArrayList<>(map.keySet());
	        list.sort((a,b)->map.get(b)-map.get(a));
	        for(int i=0;i<k;i++){
	            ans[i] = list.get(i);
	        }
	        return ans;

	    }
	}

}
