package arsh_dsa_sheet;

import java.util.HashMap;

public class Set_Matrix_zeros {
	 public void setZeroes(int[][] matrix) {
	        int m = matrix.length;
	        int n = matrix[0].length;
	        HashMap<Integer,Integer> map = new HashMap<>();

	        for(int i=0; i<m;i++){
	            for(int j =0;j<n;j++){
	                if(matrix[i][j]==0){
	                    int key = i*n+j;
	                    map.put(key,matrix[i][j]);
	                }
	            }
	        }
	        for(int m1: map.keySet()){
	            // int key = m1.getKey();
	            int row = m1 / n;
	            int col = m1 % n;
	            for(int i=0;i<m;i++){
	                matrix[i][col] =0;
	            }
	            for(int i=0;i<n;i++){
	                matrix[row][i]=0;
	            }
	        }
	        
	    }

}
