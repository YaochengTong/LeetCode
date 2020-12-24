
// @Title: 对称二叉树 (Symmetric Tree)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-11-30 06:40:26
// @Runtime: 1 ms
// @Memory: 37.9 MB

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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) { return true; }
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        deque.push(root.left);
        deque.push(root.right);
        while (!deque.isEmpty()) {
            TreeNode a = deque.pop();
            TreeNode b = deque.pop();
            if (a == null && b == null) { continue; }
            if (a == null || b == null) { return false; }
            if (a.val != b.val) { return false; }
            deque.push(a.left);
            deque.push(b.right);
            deque.push(a.right);
            deque.push(b.left);
        }
        return true;
    }
}
