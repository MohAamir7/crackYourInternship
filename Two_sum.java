package arsh_dsa_sheet;

import java.util.HashMap;

public class Two_sum {
	public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<n;i++){
            int p = target-nums[i];
            if(map.containsKey(p)){
                ans = new int[]{i,map.get(p)};
                return ans;

            }
            map.put(nums[i],i);
        }
        return ans;
        
    }

}
