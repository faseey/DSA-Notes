package Trees.Questions.BFS;

import Trees.Questions.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/average-of-levels-in-binary-tree/
public class Averagelevelsclass {
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> result = new ArrayList<>();

        if(root == null) return result;


        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);


        while(!q.isEmpty()){
            int size = q.size();
            double sum =0;

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                sum += node.val;

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            result.add(sum/size);


        }
        return result;

    }
}