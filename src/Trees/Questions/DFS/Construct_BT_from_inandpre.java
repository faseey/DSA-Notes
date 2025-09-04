package Trees.Questions.DFS;
//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
import Trees.Questions.TreeNode;

public class Construct_BT_from_inandpre {
    int idx =0;
    TreeNode construct(int[] preorder, int[] inorder,int start, int end){
        if(start>end) return null;


        int val = preorder[idx];
        int i = start;
        TreeNode root = new TreeNode(val);
        for(;i<=end;i++){
            if(inorder[i] == val){
                break;
            }
        }
        idx++;
        root.left = construct(preorder,inorder,start,i-1);
        root.right = construct(preorder,inorder,i+1,end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;

        return construct(preorder,inorder,0,n-1);

    }
}