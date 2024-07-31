package arsh_dsa_sheet;

public class Lowest_Common_Ancestor_of_Binary_Tree {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 class Solution {
		    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		    	return commonAncestor(root,p,q);
		        
		    }
		    public TreeNode commonAncestor(TreeNode root,TreeNode p, TreeNode q) {
		    	if(root==null) {
		    		return null;
		    	}
		    	if(root == q || root == p) {
		    		return root;
		    	}
		    	TreeNode left = commonAncestor(root.left,p,q);
		    	TreeNode right = commonAncestor(root.right,p,q);
		    	if(left != null && right != null) {
		    		return root;
		    	}else if(root.left==null) {
		    		return right;
		    	}else {
		    		return left;
		    	}
		    }
		}

}
