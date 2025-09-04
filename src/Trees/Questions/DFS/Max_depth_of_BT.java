package Trees.Questions.DFS;

import Trees.Questions.TreeNode;

public class Max_depth_of_BT{
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;


        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left , right) +1;

    }
}