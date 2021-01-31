
// @Title: 子树的最大平均值 (Maximum Average Subtree)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-29 18:25:33
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

    public double max = Integer.MIN_VALUE;

    public double maximumAverageSubtree(TreeNode root) {
        averageHelper(root);
        return max;
    }

    private int[] averageHelper(TreeNode root) {
        if (root == null) { return new int[] { 0, 0 }; }

        int[] helper = new int[2];
        int[] left = averageHelper(root.left);
        int[] right = averageHelper(root.right);

        helper[0] = left[0] + right[0] + root.val;
        helper[1] = left[1] + right[1] + 1;

        max = Math.max(max, (double) helper[0] / helper[1]);
        return helper;
    }
    
}
