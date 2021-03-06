
// @Title: 二叉搜索树中的插入操作 (Insert into a Binary Search Tree)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-26 17:32:12
// @Runtime: 0 ms
// @Memory: 39.1 MB

class Solution {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) { return new TreeNode(val); }
        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        } else {
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }

}





