package Trees.Questions.DFS;

import Trees.Questions.TreeNode;

public class count_good_nodes {
    int num = 0;

    public int goodNodes(TreeNode root) {
        if(root == null) return 0;

        int maxpath = root.val;
        helper(root,maxpath);
        return num;


    }
    void helper(TreeNode root,int maxpath){
        if(root == null) return;
        maxpath = Math.max(root.val,maxpath);
        if( root != null && root.val >= maxpath) num++;
        helper(root.left,maxpath);
        helper(root.right,maxpath);








    }
}