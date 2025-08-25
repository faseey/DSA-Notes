package Trees.Questions.BFS;

import Trees.Questions.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
public class Zigzagtraversal  {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root)  {
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) return res;

        Deque<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        boolean reverse = false;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();

            for(int i =0;i<size;i++){
                if(reverse){
                    TreeNode temp = q.pollLast();
                    list.add(temp.val);

                    if(temp.right != null) q.addFirst(temp.right);
                    if(temp.left != null) q.addFirst(temp.left);


                }
                else{
                    TreeNode temp = q.pollFirst();
                    list.add(temp.val);

                    if(temp.left != null) q.addLast(temp.left);
                    if(temp.right != null) q.addLast(temp.right);
                }
            }
            reverse = !reverse;
            res.add(list);

        }
        return res;

    }
}