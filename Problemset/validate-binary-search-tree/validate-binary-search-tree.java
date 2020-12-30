
// @Title: 验证二叉搜索树 (Validate Binary Search Tree)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-26 15:50:41
// @Runtime: 0 ms
// @Memory: 37.8 MB

class Solution {

    public boolean isValidBST(TreeNode root) { return helper(root, null, null); }

    public boolean helper(TreeNode root, Integer low, Integer high) {
        if (root == null) { return true; }
        int val = root.val;
        if (low != null && val <= low) { return false; }
        if (high != null && val >= high) { return false; }
        return helper(root.left, low, val) && helper(root.right, val, high);
    }

}
