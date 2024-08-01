package arsh_dsa_sheet;

public class Diameter_of_Binary_Tree {
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
		class Solution {
		    int diameter;
		    public int height(TreeNode root){
		        if (root == null) {
		            return 0;
		        }

		        int left = height(root.left);
		        int right = height(root.right);
		        diameter = Math.max(diameter, left + right);
		        
		        return Math.max(left, right) + 1;
		    }
		    public int diameterOfBinaryTree(TreeNode root) {
		        diameter = 0;
		        height(root);
		        return diameter;
		        
		    }
		}

}
