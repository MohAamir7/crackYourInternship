package arsh_dsa_sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_sum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        // Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        // Arrays.sort(A);
        int n1 = nums.length - 3, n2 = n1 + 1;
        for(int i = 0; i < n1; i++){
            for(int j = i + 1; j < n2; j++){
                for(int l = j + 1, r = n2 + 1; l < r;){
                    long temp = (long)nums[i] + nums[j] + nums[l] + nums[r];
                    if(temp < target) l++;
                    else if(temp > target) r--;
                    else{
                        ArrayList<Integer> arr = new ArrayList<>();
                        arr.add(nums[l]); arr.add(nums[i]);
                        arr.add(nums[r]); arr.add(nums[j]);
                        list.add(arr);
                        while(l < r && nums[l] == nums[l + 1]) l++;
                        while(l < r && nums[r] == nums[r - 1]) r--;
                        l++;r--;
                    }
                }
                while(j < n2 && nums[j] == nums[j + 1]) j++;
            }
            while(i < n1 && nums[i] == nums[i + 1]) i++;
        }
        return list;
}

}
