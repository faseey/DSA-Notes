package Trees.Questions.BFS;

import Trees.Questions.TreeNode;

public class Cousins_in_binary_tree {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode l = findNode(root,x);
        TreeNode r = findNode(root,y);

        return (level(root,l,0) == level(root,r,0) && !isSybling(root,l,r));
    }

    TreeNode findNode(TreeNode root , int x){
        if(root == null) return null;

        if(root.val == x){
            return root;
        }
        TreeNode N = findNode(root.left,x);
        if(N!= null){
            return N ;
        }
        return findNode(root.right,x);
    }

    boolean isSybling(TreeNode root,TreeNode l, TreeNode r){
        if (root == null) return false;


        return((root.left == l && root.right == r) || (root.left == r && root.right == l) || isSybling(root.left,l,r) ||(isSybling(root.right,l,r)));
    }


    int level(TreeNode root,TreeNode x, int level){
        if(root == null) return 0;


        if(root ==x){
            return level;
        }

        int l =level(root.left,x,level+1);
        if(l != 0){
            return l;
        }
        return level(root.right,x,level+1);

    }
}