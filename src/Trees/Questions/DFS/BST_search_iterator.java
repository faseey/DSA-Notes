package Trees.Questions.DFS;

import Trees.Questions.TreeNode;

import java.util.Stack;

public class BST_search_iterator {
    public Stack<TreeNode> st = new Stack<>();
    public BST_search_iterator(TreeNode root) {
        pushAllLeft(root);

    }

    public int next() {

        TreeNode temp = st.pop();
        if(temp.right != null){
            pushAllLeft(temp.right);
        }
        return temp.val;

    }

    public boolean hasNext() {
        if(!st.isEmpty()){
            return true;
        }
        return false;

    }
    private void pushAllLeft(TreeNode root){
        for(;root!=null;root = root.left){
            st.push(root);
        }
    }
}
