package arsh_dsa_sheet;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
	public List<Integer> spiralOrder(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        // top row
        int tr = 0;
        // left columns
        int lc = 0;
        // right columns
        int rc = c-1;
        // bottom row
        int br = r-1;
        // totalElement
        int te = 0;

        List<Integer> list = new ArrayList<Integer>();

        while(lc <= rc && tr <= br){
            // top row
            for(int i =lc;i<=rc && te<r*c;i++){
                list.add(matrix[tr][i]);

            }
            tr++;
            te++;
            // right col
            for(int i = tr;i <= br && te<r*c;i++){
                list.add(matrix[i][rc]);
            }
            rc--;
            te++;
            // bottom row
            if(tr<=br){
                for(int i=rc;i>=lc && te<r*c;i--){
                    list.add(matrix[br][i]);
                }
                br--;
            }
            te++;
            // left col
            if(lc <= rc){

            
                for(int i=br;i>=tr && te<r*c;i--){
                    list.add(matrix[i][lc]);
                }
                lc++;
            }
            te++;
        }
        return list;
        
    }

}
