
// @Title: 二叉树的前序遍历 (Binary Tree Preorder Traversal)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-11-30 05:32:29
// @Runtime: 1 ms
// @Memory: 36.9 MB

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
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) { return list; }
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                list.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return list;
    }
}
