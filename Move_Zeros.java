package arsh_dsa_sheet;

public class Move_Zeros {
	public void moveZeroes(int[] nums) {
        int nonzero =0;
        if(nums.length<=1){
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonzero]=nums[i];
                nonzero++;
            }
        }
        while(nonzero<nums.length){
            nums[nonzero]=0;
            nonzero++;
        }
        
    }

}
