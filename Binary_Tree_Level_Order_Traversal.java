package arsh_dsa_sheet;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Level_Order_Traversal {
	public void pre(List<List<Integer>> list, int l, TreeNode root) {
        if (root == null)
            return;
        if (l == list.size()) {
            List<Integer> li = new ArrayList<>();
            li.add(root.val);
            list.add(li);
        } else {

            list.get(l).add(root.val);
        }
        pre(list, l + 1, root.left);
        pre(list, l + 1, root.right);

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        pre(list, 0, root);
        return list;

    }

}
