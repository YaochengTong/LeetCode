
// @Title: 二叉树的序列化与反序列化 (Serialize and Deserialize Binary Tree)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-25 16:55:02
// @Runtime: 11 ms
// @Memory: 40.4 MB

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return seHelper(root, new StringBuilder()).toString();
    }

    public StringBuilder seHelper(TreeNode root, StringBuilder str) {
        if (root == null) { return str.append("null,"); }
        // 没有 root.val+"," 是为了拆分进行提速
        str.append(root.val);
        str.append(",");
        // Recursive
        seHelper(root.left, str);
        seHelper(root.right, str);
        // System.out.println(str.toString());
        return str;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> list = new LinkedList<>(Arrays.asList(data.split(",")));
        return deHelper(list);
    }

    public TreeNode deHelper(List<String> list) {
        String root_val = list.remove(0);
        if (root_val.equals("null")) { return null; }
        TreeNode root = new TreeNode(Integer.parseInt(root_val));
        root.left = deHelper(list);
        root.right = deHelper(list);
        return root;
    }

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
