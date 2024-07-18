package arsh_dsa_sheet;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {
	public List<Integer> findDuplicates(int[] nums) {
        // List<Integer> list = new ArrayList<>();
        // Set<Integer> set = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(set.contains(nums[i])){
        //         list.add(nums[i]);
        //     }else{
        //         set.add(nums[i]);
        //     }
        // }
        // return list;
        List<Integer> ans=new ArrayList<>();
        for(int x: nums){
            int idx=Math.abs(x)-1;
            if(nums[idx]<0)
                ans.add(idx+1);
            else
                nums[idx]*=-1;
        }
        return ans;
        
    }

}
