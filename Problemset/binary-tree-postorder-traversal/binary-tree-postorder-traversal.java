
// @Title: 二叉树的后序遍历 (Binary Tree Postorder Traversal)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-11-30 05:42:52
// @Runtime: 1 ms
// @Memory: 36.7 MB

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                list.add(0, root.val);
                root = root.right;
            }
            root = stack.pop();
            root = root.left;
        }
        return list;
    }
}
