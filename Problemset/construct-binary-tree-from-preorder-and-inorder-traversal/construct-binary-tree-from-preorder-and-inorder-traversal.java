
// @Title: 从前序与中序遍历序列构造二叉树 (Construct Binary Tree from Preorder and Inorder Traversal)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-20 10:51:17
// @Runtime: 3 ms
// @Memory: 38.9 MB

class Solution {

    private Map<Integer, Integer> map;

    public TreeNode helper(int[] pre, int pre_left, int pre_right,
        int in_left) {
        // Boundary
        if (pre_left > pre_right) { return null; }
        // Find root value
        int root_val = pre[pre_left];
        TreeNode root = new TreeNode(root_val);
        int in_index = map.get(root_val);
        int size = in_index - in_left;
        // recursive
        root.left = helper(pre, pre_left + 1, pre_left + size, in_left);
        root.right = helper(pre, pre_left + size + 1, pre_right, in_index + 1);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) { map.put(inorder[i], i); }
        return helper(preorder, 0, preorder.length - 1, 0);
    }

}
