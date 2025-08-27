package Trees.Questions.DFS;

import Trees.Questions.TreeNode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
public class FlatternBinarytree  {
    public void flatten(TreeNode root) {
        if(root == null) return;

        TreeNode curr = root;

        while(curr != null){
            if(curr.left != null){
                TreeNode temp = curr.left;

                while(temp.right != null){
                    temp = temp.right;
                }

                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;


            }
            curr = curr.right;
        }

    }
}
// ✅ Approach 1: Extra Space (Preorder Traversal)
class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;
        List<TreeNode> nodes = new ArrayList<>();
        preorder(root, nodes);

        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).left = null;
            nodes.get(i).right = nodes.get(i + 1);
        }
    }

    private void preorder(TreeNode node, List<TreeNode> nodes) {
        if (node == null) return;
        nodes.add(node);
        preorder(node.left, nodes);
        preorder(node.right, nodes);
    }
}
