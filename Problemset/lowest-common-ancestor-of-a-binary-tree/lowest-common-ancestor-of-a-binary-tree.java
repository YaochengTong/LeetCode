
// @Title: 二叉树的最近公共祖先 (Lowest Common Ancestor of a Binary Tree)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-24 17:02:19
// @Runtime: 7 ms
// @Memory: 40.4 MB

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    // DFS
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) { return null; }
        if (root.val == p.val || root.val == q.val) { return root; }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) { return root; }
        if (left == null) { return right; }
        if (right == null) { return left; }

        return null;
    }



}
