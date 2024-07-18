package arsh_dsa_sheet;

public class SubTree_of_Another_Tree {
	public boolean isCheck(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;
        if(root.val == subRoot.val){
            return isCheck(root.left,subRoot.left) && isCheck(root.right,subRoot.right);
        }
        return false;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) return true;
        if(root == null) return false;

        if(root.val == subRoot.val){
            if(isCheck(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
        
    }

}
