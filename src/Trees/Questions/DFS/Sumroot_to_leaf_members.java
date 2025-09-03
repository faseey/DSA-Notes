package Trees.Questions.DFS;

import Trees.Questions.TreeNode;
//https://leetcode.com/problems/sum-root-to-leaf-numbers/
public class Sumroot_to_leaf_members {
    int res = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;
        helper(root, 0);
        return res;

    }

    void helper(TreeNode root, int sum) {
        if (root == null)
            return;

        sum *= 10;
        sum += root.val;
        if (root.left == null && root.right == null) {
            res += sum;
            return;

        }
        helper(root.left, sum);
        helper(root.right, sum);
    }
}