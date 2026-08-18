/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        ArrayList<Integer> lst = new ArrayList<>();
        if(root == null) return lst;
        return preorder(root,lst);
    }

    public List<Integer> preorder(TreeNode node,List<Integer> lst){

        if(node == null) return null;
        lst.add(node.val);
        preorder(node.left,lst);
        preorder(node.right,lst);

        return lst;
    }
    
}