
// @Title: 路径总和 (Path Sum)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-11-29 03:50:56
// @Runtime: 0 ms
// @Memory: 38.6 MB

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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {return false;}
        if (root.left == null && root.right == null) { return sum == root.val; }
        sum = sum - root.val;
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}
