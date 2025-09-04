package Trees.Questions.DFS;

import Trees.Questions.TreeNode;

public class Diametre_of_binary_tree {
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {

        height(root);
        return maxDiameter;

    }

    int height(TreeNode root){
        if(root == null) return 0;

        int lefth = height(root.left);
        int righth = height(root.right);

        int currdia = lefth+righth ;
        maxDiameter = Math.max(currdia,maxDiameter);

        return Math.max(lefth,righth)+1 ;
    }
}
