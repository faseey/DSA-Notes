package Trees.Questions.BFS;

import Trees.Questions.TreeNode;
//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
public class populating_next_right_pointerclass {
    public TreeNode connect(TreeNode root) {
        if(root == null) return null;


        TreeNode leftmost = root;

        while(leftmost.left!= null){
            TreeNode current = leftmost;
            while(current !=null){
                current.left.next = current.right;
                if(current.next != null){
                    current.right.next = current.next.left;
                }
                current = current.next;

            }
            leftmost = leftmost.left;
        }
        return root;
    }

}