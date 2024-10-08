package arsh_dsa_sheet;

public class IsBalanced {
	public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode() {}
		     TreeNode(int val) { this.val = val; }
		     TreeNode(int val, TreeNode left, TreeNode right) {
		         this.val = val;
		         this.left = left;
		         this.right = right;
		     }
		 }
		 
		class Solution {
		    public boolean isBalanced(TreeNode root) {
		    	return balanced(root);
		    	
		        
		    }
		    public boolean balanced(TreeNode root) {
		    	if(root == null) return true;
		    	
		    	boolean left = balanced(root.left);
		    	boolean right = balanced(root.right);
		    	
		    	boolean sb = Math.abs(ht(root.left)-ht(root.right))<=1;
		    	return left && right && sb;
		    }
		    
		    public int ht(TreeNode root) {
		    	if(root == null) return -1;
		    	
		    	int lh = ht(root.left);
		    	int rh = ht(root.right);
		    	return Math.max(lh, rh)+1;
		    }
		}

}
