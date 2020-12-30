
// @Title: 从中序与后序遍历序列构造二叉树 (Construct Binary Tree from Inorder and Postorder Traversal)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-19 20:49:02
// @Runtime: 4 ms
// @Memory: 38.3 MB

class Solution {

    public int post_index;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length == 0) { return null; }
        if (inorder.length != postorder.length) { return null; }
        post_index = postorder.length - 1;
        return helper(inorder, postorder, 0, post_index);
    }

    public TreeNode helper(int[] inorder, int[] postorder, int start, int end) {
        if (start > end) { return null; }
        int root_value = postorder[post_index];
        post_index--;
        TreeNode root = new TreeNode(root_value);
        int in_index = findInorderRoot(inorder, start, end, root_value);
        root.right = helper(inorder, postorder, in_index + 1, end);
        root.left = helper(inorder, postorder, start, in_index - 1);
        return root;
    }

    private int findInorderRoot(int[] arr, int l, int r, int key) {
        for (int i = l; i <= r; i++) { if (arr[i] == key) { return i; } }
        return -1;
    }

}
