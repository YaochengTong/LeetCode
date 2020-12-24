
// @Title: 二叉树的层序遍历 (Binary Tree Level Order Traversal)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-11-28 09:15:22
// @Runtime: 1 ms
// @Memory: 38.9 MB

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        deque.add(root);
        while (!deque.isEmpty()) {
            List<Integer> levelList = new ArrayList<Integer>();
            int currentLevelSize = deque.size();
            for (int i = 0; i < currentLevelSize; i++) {
                TreeNode temp = deque.remove();
                levelList.add(temp.val);
                if (temp.left != null) {
                    deque.add(temp.left);
                }
                if (temp.right != null) {
                    deque.add(temp.right);
                }
            }
            list.add(levelList);
        }
        return list;
    }

}
