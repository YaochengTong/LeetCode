
// @Title: 二叉树的最大深度 (Maximum Depth of Binary Tree)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-16 18:57:40
// @Runtime: 1 ms
// @Memory: 38.4 MB

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

    public int maxDepth(TreeNode root) {
        if (root == null) { return 0; }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int max = 0;
        queue.add(root);
        while(!queue.isEmpty()) {
            int currentLevelSize = queue.size();
            for (int i = 0; i < currentLevelSize; i++) {
                TreeNode temp = queue.remove();
                if(temp.left!=null) { queue.add(temp.left); }
                if(temp.right!=null) { queue.add(temp.right); }
            }
            max++;
        }
        return max;
    }

}
