
// @Title: 二叉树展开为链表 (Flatten Binary Tree to Linked List)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-27 19:15:53
// @Runtime: 0 ms
// @Memory: 37.8 MB

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
    public void flatten(TreeNode root) {
        if (root == null) { return; }
        flatten(root.left);
        flatten(root.right);

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;

        TreeNode curr = root;
        while (curr.right != null) { curr = curr.right; }
        curr.right = temp;
    }
}
