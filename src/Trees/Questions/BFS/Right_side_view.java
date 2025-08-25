package Trees.Questions.BFS;

import Trees.Questions.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Right_side_view {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if (root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            TreeNode temp = null;
            for(int i =0;i<size;i++){
                temp = q.poll();

                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            res.add(temp.val);

        }
        return res;
    }
}
//https://leetcode.com/problems/binary-tree-right-side-view/