package Trees.Questions.DFS;
import Trees.Questions.TreeNode;

public class invert_binarytree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode left  = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}