package Trees.Questions.DFS;

import Trees.Questions.TreeNode;
//https://leetcode.com/problems/binary-tree-maximum-path-sum/
public class Maximum_path_sum  {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;

        }
        helper(root);
        return ans;
    }

    int helper(TreeNode node){
        if(node == null) return 0;

        int l = Math.max(0,helper(node.left));
        int r = Math.max(0,helper(node.right));

        ans = Math.max(ans,l+r+node.val);

        return Math.max(l,r)+ node.val;
    }
}