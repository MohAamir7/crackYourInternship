package arsh_dsa_sheet;

public class Maximum_points_you_can_obtain_from_card {
	 public int maxScore(int[] cardPoints, int k) {
	        int n = cardPoints.length-1;
	        int rs = 0;
	        int ls = 0;
	        int ans = 0;
	        for(int i=0;i<k;i++){
	            ls += cardPoints[i];
	        }
	        ans = ls;
	        for(int i=k-1;i>=0;i--){
	            ls = ls - cardPoints[i];
	            rs = rs + cardPoints[n];
	            ans = Math.max(ans,ls+rs);
	            n--;

	        }
	        
	        return ans;
	        
	    }

}
