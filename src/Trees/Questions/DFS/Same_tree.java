package Trees.Questions.DFS;

import Trees.Questions.TreeNode;
//https://leetcode.com/problems/same-tree/
public class Same_tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p== null && q== null) return true;
        if(p== null || q== null) return false;
        if(p.val != q.val) return false;


        boolean left = isSameTree(p.left,q.left);
        boolean right = isSameTree(p.right,q.right);

        return left && right;


    }
}