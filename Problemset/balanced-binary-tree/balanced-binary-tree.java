
// @Title: 平衡二叉树 (Balanced Binary Tree)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-28 20:57:51
// @Runtime: 1 ms
// @Memory: 38.7 MB

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
    public boolean isBalanced(TreeNode root) {
        return depth(root) != -1;
    }

    private int depth(TreeNode root) {
        if (root == null) { return 0; }
        int left = depth(root.left);
        int right = depth(root.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) { return -1; }
        return Math.max(left, right) + 1;
    }
}
