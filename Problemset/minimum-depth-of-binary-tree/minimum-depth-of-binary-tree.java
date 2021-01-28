
// @Title: 二叉树的最小深度 (Minimum Depth of Binary Tree)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-26 14:14:49
// @Runtime: 8 ms
// @Memory: 59.3 MB

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
    public int minDepth(TreeNode root) {
        if (root == null) { return 0; }
        if (root.left == null) { return minDepth(root.right) + 1; }
        if (root.right == null) { return minDepth(root.left) + 1; }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
