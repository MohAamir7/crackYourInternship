package arsh_dsa_sheet;

import java.util.Arrays;

public class Merge_Two_Sorted_Array {
	public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int j =0,i = m; j<n;j++){
            nums1[i] = nums2[j];
            i++;
        }
        // we can use quick sort algo also
        Arrays.sort(nums1);
        
    }

}
